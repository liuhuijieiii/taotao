package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 展示系统首页
 * @author 刘慧杰
 *
 */
@Controller
public class PageController {
	@RequestMapping("/index")
	public String showIndexString () {
		return "index";
	}
	
	//显示商品查询界面
	@RequestMapping("/{page}")
	public String showPage (@PathVariable String page) {
		return page;
	}
}
