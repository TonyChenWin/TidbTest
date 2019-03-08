package com.pingcap.serviceImpl;

import com.pingcap.common.FreeMarkerUtils;
import com.pingcap.common.ScriptExcutor;
import com.pingcap.pojo.CmdResult;
import com.pingcap.service.DeployService;
import freemarker.template.Template;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DeployServiceImpl implements DeployService {
    @Value("${tidb_test.deploy_yml_path}")
    private String DEPLOY_YML_PATH;

    @Value("${tidb_test.compose_path}")
    private String COMPOSE_PATH;

    @Value("${tidb_test.generate_deploy_yml_path}")
    private String GENERATE_DEPLOY_YML_PATH;

    @Value("${tidb_test.cmd.stop_server}")
    private String CMD_STOP_SERVER;

    @Value("${tidb_test.cmd.generate_deploy_yml}")
    private String CMD_GENERATE_DEPLOY_YML;

    @Value("${tidb_test.cmd.download_tidb_docker}")
    private String CMD_DOWNLOAD_TIDB_DOCKER;

    @Value("${tidb_test.cmd.run_tidb_docker}")
    private String CMD_RUN_TIDB_DOCKER;

    public List<CmdResult> deploy(int pdSize, int tikvSize) throws Exception {
        if (pdSize < 1){
            throw new Exception("pdSize must greater than 1");
        }

        if (tikvSize < 1){
            throw new Exception("tikvSize must greater than 1");
        }

        List<CmdResult> cmdResultList = new ArrayList<>();

        Template template = FreeMarkerUtils.getCfg().getTemplate("./deploy.ftl");
        Map<String, Object> root = new HashMap<>();
        root.put("pdSize", pdSize);
        root.put("tikvSize", tikvSize);
        String content = FreeMarkerTemplateUtils.processTemplateIntoString(template, root);

        FileUtils.writeStringToFile(new File(DEPLOY_YML_PATH), content);

        String cmdGenerateDeployYml = CMD_GENERATE_DEPLOY_YML.replace("&{deploy_yml_path}", DEPLOY_YML_PATH).
                replace("&{generate_deploy_yml_path}", GENERATE_DEPLOY_YML_PATH).replace("&{compose_path}", COMPOSE_PATH);
        String cmdDownloadTidbDocker = CMD_DOWNLOAD_TIDB_DOCKER.replace("&{generate_deploy_yml_path}", GENERATE_DEPLOY_YML_PATH);
        String cmdRunTidbDocker = CMD_RUN_TIDB_DOCKER.replace("&{generate_deploy_yml_path}", GENERATE_DEPLOY_YML_PATH);
        String cmsStopServer = CMD_STOP_SERVER.replace("&{generate_deploy_yml_path}", GENERATE_DEPLOY_YML_PATH);

        ScriptExcutor scriptExcutor = new ScriptExcutor();
        // 先操作stop，防止缩容部署时，有残余的docker镜像
        cmdResultList.add(scriptExcutor.runCmd(cmsStopServer, false));
        cmdResultList.add(scriptExcutor.runCmd(cmdGenerateDeployYml, false));
        cmdResultList.add(scriptExcutor.runCmd(cmdDownloadTidbDocker, false));
        cmdResultList.add(scriptExcutor.runCmd(cmdRunTidbDocker, false));

        return cmdResultList;
    }
}
