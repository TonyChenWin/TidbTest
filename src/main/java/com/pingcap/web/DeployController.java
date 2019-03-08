package com.pingcap.web;

import com.pingcap.common.ApiResponse;
import com.pingcap.pojo.CmdResult;
import com.pingcap.service.DeployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/deploy")
public class DeployController {
	@Autowired
	DeployService deployService;

	@RequestMapping(value = "/deploy", method = RequestMethod.POST)
	public ApiResponse<List<CmdResult>> deploy(@RequestParam(required = true) int pdSize,@RequestParam(required = true)  int tikvSize) throws Exception {
		return new ApiResponse<>(deployService.deploy(pdSize, tikvSize));
	}
}
