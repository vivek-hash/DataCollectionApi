package com.vivek.controller;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vivek.binding.IncomeDetails;
import com.vivek.service.IIncomeDetailService;

@RestController
public class IncomeDetailController {

	IIncomeDetailService service;
	
	@PostMapping("/incomedetails")
	public String save(@RequestBody IncomeDetails incomeDetails) {
		
		String save = service.saveIncomeDetails(incomeDetails); 
		return "details submitted successfully";
		
	}
}
