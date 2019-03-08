package com.pingcap.web;

import com.pingcap.common.ApiResponse;
import com.pingcap.pojo.CmdResult;
import com.pingcap.service.ErrorInjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/error_inject")
public class ErrorInjectController {
    @Autowired
    ErrorInjectService errorInjectService;

    @RequestMapping(value = "/stop_server", method = RequestMethod.POST)
    public ApiResponse<CmdResult> stopServer(@RequestParam(required = false) String server) throws Exception {
        return new ApiResponse<>(errorInjectService.stopServer(server));
    }
}
