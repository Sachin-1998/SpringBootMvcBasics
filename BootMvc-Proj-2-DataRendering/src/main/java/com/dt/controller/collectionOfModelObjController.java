package com.dt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.dt.entity.Employee;

@Controller
public class collectionOfModelObjController 
{
	@GetMapping("/getEmployee")
	public String sendEmpData(Map<String, Object> map)
	{
		List<Employee> empList=List.of(new Employee(1020,"Ram",76009.0,false),
				new Employee(2380, "Somu", 65430.0, true),
				new Employee(6543, "Gomu", 65432.0, true),
				new Employee(6657, "suresh", 77890.0, true));
		
		map.put("EmployeeData", empList);
		return "employee_report";
		
	}

}
