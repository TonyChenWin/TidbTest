package com.pingcap.common;

import com.pingcap.pojo.CmdResult;
import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ScriptExcutor {

    public CmdResult runCmd(String cmd, boolean isOutPutCmdMsg) throws Exception {
        CmdResult cmdResult = new CmdResult();
        cmdResult.setCmd(cmd);

        try{
            // 启动独立线程等待process执行完成
            CommandWaitForThread commandThread = new CommandWaitForThread(cmd, cmdResult);
            commandThread.start();
            while(!commandThread.isFinish()){
                Thread.sleep(100);
            }

            // 检查脚本执行结果状态码
            if (commandThread.getExitValue() != 0){
                if (isOutPutCmdMsg) {
                    cmdResult.getRunningLogs().add("[error] run fail, exitValue = " + commandThread.getExitValue());
                }
                cmdResult.setPass(false);
            } else {
                if (isOutPutCmdMsg) {
                    cmdResult.getRunningLogs().add("[info] run success");
                }
                cmdResult.setPass(true);
            }

            return cmdResult;
        } catch (Exception e) {
            String markLog;
            markLog = "[tidb-test-error] run cmd occur exception, cmd : " + cmd;
            cmdResult.getRunningLogs().add(markLog);
            e.printStackTrace();
            throw new Exception(markLog, e);
        }
    }

    @Setter
    @Getter
    public class CommandWaitForThread extends Thread {
        private String cmd;
        private boolean isFinish = false;
        private int exitValue = -1;
        CmdResult cmdResult;

        public CommandWaitForThread(String cmd, CmdResult cmdResult){
            this.cmd = cmd;
            this.cmdResult = cmdResult;
        }

        public void run(){
            try{
                // 执行脚本并等待脚本执行完成
                Process process = Runtime.getRuntime().exec(cmd);
                // 记录脚本执行中的过程信息
                BufferedReader infoInput = new BufferedReader(new InputStreamReader(process.getInputStream(), "utf-8"));
                BufferedReader errorInput = new BufferedReader(new InputStreamReader(process.getErrorStream(), "utf-8"));
                String infoLine = "";
                String errorLine = "";
                while ((infoLine = infoInput.readLine()) != null || (errorLine = errorInput.readLine()) != null){
                    if(!StringUtils.isEmpty(infoLine)) {
                        cmdResult.getRunningLogs().add("[info] " + infoLine);
                    }
                    if(!StringUtils.isEmpty(errorLine)){
                        cmdResult.getRunningLogs().add("[error] " + errorLine);
                    }
                }

                infoInput.close();
                errorInput.close();

                // 阻塞执行线程直到脚本执行完成后返回
                this.exitValue = process.waitFor();
            } catch (Throwable e) {
                cmdResult.getRunningLogs().add("[tidb-test-error] " + "CommandWaitForThread has accure an exception, cmd " + cmd);
            } finally {
                isFinish = true;
            }
        }
    }
}
