package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class testController 
{
	@RequestMapping("/process")
	public String message()
	{
		System.out.println("testController.message()");
		return "welcome";
	}
}
