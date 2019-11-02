package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.service.TestService;

/**
 * 测试使用controller测试当前时间
 * @author 刘慧杰
 *
 */
@Controller
public class TestController {
	
	 @Autowired 
	 private TestService testService;
	 
	 @RequestMapping("test/queryNow")	 
	 @ResponseBody 
	 public String queryNow() { 
		 
		 return testService.queryNow();
	}
	 
}
