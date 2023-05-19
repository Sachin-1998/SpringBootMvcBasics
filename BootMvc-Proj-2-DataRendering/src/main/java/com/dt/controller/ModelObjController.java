package com.dt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.dt.entity.Employee;

@Controller
public class ModelObjController 
{
	@GetMapping("/getEmpData")
	public String modelData(Map<String, Object> map)
	{
		Employee emp=new Employee();
		emp.setEno(101);
		emp.setEname("Rahul");
		emp.setSalary(45000.0);
		emp.setIsVaccinated(true);
		map.put("empdata", emp);
		return "employee_data";
	}
}
