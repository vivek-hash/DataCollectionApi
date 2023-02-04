package com.vivek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.vivek.service.EducationDetailService;

@RestController
public class EducationDetailController {

	@Autowired
	private EducationDetailService EduService;
	
	
}
