package com.vivek.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.vivek.binding.IncomeDetails;
import com.vivek.repository.IncomeDetailsRepository;
import com.vivek.service.IIncomeDetailService;


public class IncomeDetailServiceImpl implements IIncomeDetailService {

	
	@Autowired
	private IncomeDetailsRepository repo;
	@Override
	public String saveIncomeDetails(IncomeDetails incomeDetails) {
		
		return null;
	}

	

}
