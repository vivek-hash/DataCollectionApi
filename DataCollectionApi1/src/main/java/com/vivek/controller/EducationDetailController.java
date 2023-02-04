package com.vivek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vivek.binding.EducationDetails;

import com.vivek.service.IEducationDetailService;

@RestController
public class EducationDetailController {

	@Autowired
	private IEducationDetailService service;
	
	@PostMapping("/educationdetails")
	public String save(@RequestBody EducationDetails educationDetails) {
		
		String save = service.saveEducationDetails(educationDetails); 
		return " Education details submitted successfully";
		
	}
}
