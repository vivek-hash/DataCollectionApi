package com.vivek.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.vivek.binding.IncomeDetails;
import com.vivek.repository.IncomeDetailsRepository;
import com.vivek.service.IncomeDetailService;


public class IncomeDetailServiceImpl implements IncomeDetailService {

	
	@Autowired
	private IncomeDetailsRepository repo;
	@Override
	public String saveIncomeDetails(IncomeDetails incomeDetails) {
	
		
		
		return null;
	}

	

}
