package com.it.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.it.service.ISeasonFinderService;

@Controller
public class SeasonOperationController {
	@Autowired
	private ISeasonFinderService service;

	@RequestMapping("/")
	public String showHome() {
		System.out.println("SeasonOperationController.showHome()");
		return "home_page";
	}

	@RequestMapping("/season")
	public String showSeason(Map<String, Object> map)
	{
		System.out.println("SeasonOperationController.showSeason()");
		//use service
		String msg = service.seasonFinder();
		//put in model attribute
		map.put("Result", msg);
		//return lvn
		return "season_page";
		

	}

}
