package com.vivek.service;

import com.vivek.binding.EducationDetails;

public interface IEducationDetailService {

	public Integer getCaseId();
	public String saveEducationDetails(EducationDetails educationDetails);
}
