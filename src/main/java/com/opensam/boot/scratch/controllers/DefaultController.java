package com.opensam.boot.scratch.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DefaultController {
	
	final static Logger logger = Logger.getLogger(DefaultController.class);
	
	@Value("${boot.scratch.name}")
	private String name;

	
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Yee Ha";
	}
	
}
