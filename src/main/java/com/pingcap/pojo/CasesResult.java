package com.pingcap.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class CasesResult{
    private int runNum;
    private int failNum;
    private int passNum;
    private Map<String, CaseResult> failResultDetail;
    private Map<String, CaseResult> passResultDetail;

    public CasesResult() {
        super();
        failResultDetail = new HashMap<>();
        passResultDetail = new HashMap<>();
        runNum = 0;
        failNum = 0;
        passNum = 0;
    }

    public void addFailNum(){
        failNum ++;
    }

    public void addPassNum(){
        passNum ++;
    }
}
