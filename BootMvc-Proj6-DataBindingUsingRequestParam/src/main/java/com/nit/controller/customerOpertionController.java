package com.nit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class customerOpertionController {

	@GetMapping("/data")
	public String getData(@RequestParam("cno") int id, @RequestParam("cname") String name) {
		System.out.println(id + " " + name);
		return "Hi,Data Binding Using RequestParam1";
	}

	@GetMapping("/data1")
	public String getData1(@RequestParam int cno, @RequestParam String cname) {
		System.out.println(cno + " " + cname);
		return "Hi,Data Binding Using RequestParam2";
	}
	
	@GetMapping("/data2")
	public String getData2(@RequestParam int cno, @RequestParam(required = false) String cname) {
		System.out.println(cno + " " + cname);
		return "Hi,Data Binding Using RequestParam3";
	}
	@GetMapping("/data3")
	public String getData3(@RequestParam int cno, @RequestParam(defaultValue = "sachin") String cname) {
		System.out.println(cno + " " + cname);
		return "Hi,Data Binding Using RequestParam4";
	}
	

}
