package com.pingcap.service;

import com.pingcap.pojo.CasesResult;

import java.util.List;

public interface TestService {
    List<String> listCases();
    CasesResult runCases(List<String> cases) throws Exception;
}
