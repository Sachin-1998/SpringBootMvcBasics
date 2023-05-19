package com.nit.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nit.entity.Student;

@Controller
public class StudentOperationController 
{
	@GetMapping("/")
	public String showHomePage()
	{
		return "welcome";
	}
	//show register page
	@GetMapping("/register")
	public String showStudentFormPage()
	{
		return "register_page";
	}
	
	//show result page
	@PostMapping("/register")
	public String showRegiterStudentPage(Map<String, Object> map, @ModelAttribute("login") Student student)
	{
		System.out.println("StudentOperationController.showStudentDisplayPage()");
		System.out.println("From View Comp:: "+student);
		String result=null;
		if(student.getSmarks()>=85)
			result="First Class With Distinction";
		else if(student.getSmarks()>=75)
			result="First Class";
		else if(student.getSmarks()>=65)
			result="Second Class";
		else if(student.getSmarks()>=35)
			result="Third Class ";
		else
			result="Fail";
		
		map.put("Grades", result);

        return "result_page";
	}

}
