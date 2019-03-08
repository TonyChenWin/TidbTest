package com.pingcap.serviceImpl;

import com.pingcap.common.ScriptExcutor;
import com.pingcap.pojo.CaseResult;
import com.pingcap.pojo.CasesResult;
import com.pingcap.pojo.CmdResult;
import com.pingcap.service.TestService;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Value("${tidb_test.case_path}")
    private String CASE_PATH;

    @Value("${tidb_test.cmd.run_case}")
    private String CMD_RUN_CASE;

    @Value("${tidb_test.tidb_host}")
    private String TIDB_HOST;

    @Value("${tidb_test.tidb_port}")
    private String TIDB_PORT;

    @Override
    public List<String> listCases() {
        List<File> caseFiles = (List<File>) FileUtils.listFiles(new File(CASE_PATH), new String[]{"test"}, false);
        List<String> cases = new ArrayList<>();
        for (File caseFile : caseFiles){
            cases.add(caseFile.getName());
        }
        return cases;
    }

    @Override
    public CasesResult runCases(List<String> cases) throws Exception {
        CasesResult casesResult = new CasesResult();
        casesResult.setRunNum(cases.size());
        ScriptExcutor scriptExcutor = new ScriptExcutor();
        String cmd = CMD_RUN_CASE;
        cmd = cmd.replace("&{tidb_host}", TIDB_HOST);
        cmd = cmd.replace("&{tidb_port}", TIDB_PORT);
        cmd = cmd.replace("&{case_path}", CASE_PATH);

        for (String theCase : cases){
            boolean isPass = false;
            String runCmd = cmd + theCase;
            CaseResult caseResult = new CaseResult();
            CmdResult cmdResult = scriptExcutor.runCmd(runCmd, false);
            caseResult.setRunningLogs(cmdResult.getRunningLogs());
            for (int i = cmdResult.getRunningLogs().size() - 1; i > 0; i--){
                String log = cmdResult.getRunningLogs().get(i);
                if ("[info]ok".equals(log)) {
                    isPass = true;
                    break;
                }
            }

            if (isPass) {
                caseResult.setPass(true);
                casesResult.addPassNum();
                casesResult.getPassResultDetail().put(theCase, caseResult);
            } else {
                caseResult.setPass(false);
                casesResult.addFailNum();
                casesResult.getFailResultDetail().put(theCase, caseResult);
            }
        }

        return casesResult;
    }
}
