package com.vivek.controller;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.vivek.service.CreateCaseService;

@RestController
public class CreateCaseController {
	
	private CreateCaseService caseService;

	@GetMapping("create/{appId}")
	public ResponseEntity<Long> createCase(@PathVariable("appId") Long appId){
		
		Long caseNumber = caseService.createCaseId(appId);
		return ResponseEntity.ok(caseNumber);
		
	}
	
}
