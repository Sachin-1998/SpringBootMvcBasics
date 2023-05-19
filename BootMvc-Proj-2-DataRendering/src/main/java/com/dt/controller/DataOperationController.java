package com.dt.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class DataOperationController {

	@GetMapping("/data")
	public String process(Map<String, Object> map) {
		System.out.println("DataOperationController.process()" + map.getClass());
		// add model attribute to shared memory
		map.put("attr1", "value1");
		map.put("SysDate", LocalDateTime.now());
		// return lvn name
		return "show_data";
	}

	/*
	 * @RequestMapping("/data") public String process(Model model) {
	 * System.out.println("DataOperationController.process()"+model.getClass());
	 * //add model attribute to shared memory model.addAttribute("attr1", "value1");
	 * model.addAttribute("SysDate", LocalDateTime.now()); //return lvn name return
	 * "show_data"; }
	 */
	/*
	 * @RequestMapping("/data") public String process(ModelMap model) {
	 * System.out.println("DataOperationController.process()"+model.getClass());
	 * //add model attribute to shared memory model.addAttribute("attr1", "value1");
	 * model.addAttribute("SysDate", LocalDateTime.now()); //return lvn name return
	 * "show_data"; }
	 */
	// using old style

	/*
	 * @RequestMapping("/data") public ModelAndView process() {
	 * System.out.println("DataOperationController.process()"); //create
	 * ModelAndView Object ModelAndView mav=new ModelAndView();
	 * mav.addObject("attr1", "value1"); mav.addObject("SysDate",
	 * LocalDateTime.now()); mav.setViewName("show_data"); //return lvn name return
	 * mav; }
	 */
	
	//send data to browser without using view component
	@RequestMapping("/send")
	public void sendToBrowser(HttpServletResponse res) throws IOException
	{
		//get printwriter
		//printwriter is directly use to write a message to browser directly so the option of taking request path name as 
		//lvn is gone
		PrintWriter pr=res.getWriter();
		//set content type
		res.setContentType("text/html");
		//write data to browser s/w
		pr.println("<b>directly from handler method<b/>");
		
		
	}

}
