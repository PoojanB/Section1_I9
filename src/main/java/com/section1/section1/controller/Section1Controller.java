package com.section1.section1.controller;

 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.section1.section1.entities.Section1;
import com.section1.section1.services.Section1Service;

@RestController
public class Section1Controller {
	
	@Autowired
	private Section1Service section1Service;
	
	@GetMapping("/test")
	public String test() {
		
		return "This is a test";
	}
	
	//Get all values for Section 1
	
	@GetMapping("/Section1")
	public List<Section1> getSection1()
	{
		
		return this.section1Service.getSection1();
		
		
	}
	
	@GetMapping("/Section1/{empId}")
	public Section1 getSection1Id(@PathVariable String empId)
	{
		return this.section1Service.getSection1Id(Long.parseLong(empId));
		
	}
	
	@PostMapping("/Section1")
	public Section1 addSection1(@RequestBody Section1 section1)
	{
		return this.section1Service.addSection1(section1);
	}

}
