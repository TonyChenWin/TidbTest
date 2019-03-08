package com.pingcap.service;

import com.pingcap.pojo.CmdResult;
import java.util.List;

public interface DeployService {
    List<CmdResult> deploy(int pdSize, int tikvSize) throws Exception;
}
