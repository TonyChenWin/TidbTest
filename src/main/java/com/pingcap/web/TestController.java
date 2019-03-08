package com.pingcap.web;

import com.pingcap.common.ApiResponse;
import com.pingcap.pojo.CasesResult;
import com.pingcap.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/case")
public class TestController {
	@Autowired
	TestService testService;

	@RequestMapping(value = "/cases", method = RequestMethod.GET)
	public ApiResponse<List<String>> listCases() throws Exception {
		return new ApiResponse<>(testService.listCases());
	}

	@RequestMapping(value = "/run_cases", method = RequestMethod.POST)
	public ApiResponse<CasesResult> runCases(@RequestBody(required = true) List<String> cases) throws Exception {
		return new ApiResponse<>(testService.runCases(cases));
	}
}
