package com.wqz.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("app/")
public class WebEntranceController {
	@RequestMapping("index")
	public String index() {
		return "index";
	}
}
