package com.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.lms.service.CommonService;

@Controller
public class CommonController {
	
	@Autowired
	private CommonService commonService;
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String goHome(){
		return "index";
	}

}
