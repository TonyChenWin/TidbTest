package com.pingcap.service;

import com.pingcap.pojo.CmdResult;

public interface ErrorInjectService {
    CmdResult stopServer(String server) throws Exception;
}
