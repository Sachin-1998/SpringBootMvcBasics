package com.dt.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DataPassingController 
{
	//passing simple data
	@GetMapping("/simple")
	public String sendData(Map<String , Object> map)
	{
		System.out.println("DataPassingController.sendData()");
		map.put("Name", "Somu");
		map.put("rn", 21);
		return "simple_data";
	}
	//passing collection type data
	@GetMapping("/mydata")
	public String passData(Map<String, Object> map)
	{
		map.put("student", List.of(2,"Rahul","pune",67));
		map.put("phoneNumbers", Set.of(8565458890L,8390454366L,9545786678L));
		map.put("idDetails",Map.of("adharId",7865453390L,"voterId",76754788L));
		map.put("favColours", new String [] {"Black","red","Blue"});
		//return "show_report";
		return "show_report1";
	}

}
