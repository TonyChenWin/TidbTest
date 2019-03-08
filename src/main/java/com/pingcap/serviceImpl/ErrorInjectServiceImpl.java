package com.pingcap.serviceImpl;

import com.pingcap.common.ScriptExcutor;
import com.pingcap.pojo.CmdResult;
import com.pingcap.service.ErrorInjectService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class ErrorInjectServiceImpl implements ErrorInjectService {
    @Value("${tidb_test.cmd.stop_server}")
    private String CMD_STOP_SERVER;

    @Value("${tidb_test.generate_deploy_yml_path}")
    private String GENERATE_DEPLOY_YML_PATH;

    @Override
    public CmdResult stopServer(String server) throws Exception {
        ScriptExcutor scriptExcutor = new ScriptExcutor();
        if (StringUtils.isEmpty(server)){
            server = "";
        }

        String cmsStopServer = CMD_STOP_SERVER.replace("&{generate_deploy_yml_path}", GENERATE_DEPLOY_YML_PATH);
        CmdResult cmdResult = scriptExcutor.runCmd( cmsStopServer + " " + server, true);

        return cmdResult;
    }
}
