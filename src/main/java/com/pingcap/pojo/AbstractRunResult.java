package com.pingcap.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public abstract class AbstractRunResult {
    private boolean isPass;
    private String cmd;
    private List<String> runningLogs;

    public AbstractRunResult() {
        runningLogs = new ArrayList<>();
    }
}

