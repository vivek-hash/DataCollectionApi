package com.vivek.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.vivek.binding.EducationDetails;
import com.vivek.repository.EducationDetailsRepository;
import com.vivek.service.IEducationDetailService;

public class EducationDetailsServiceImpl implements IEducationDetailService {

	@Autowired
	private EducationDetailsRepository repo;
	@Override
	public Integer getCaseId() {
		
		return null;
	}

	@Override
	public String saveEducationDetails(EducationDetails educationDetails) {
	
		return null;
	}

}
