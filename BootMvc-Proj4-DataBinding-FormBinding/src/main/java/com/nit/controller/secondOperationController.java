package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class secondOperationController 
{
	@GetMapping("/data")
	public String showViewData(@RequestParam int sno,@RequestParam String sname)
	{
		System.out.println(sno+" "+sname);
		return "result_page";
	}

}
