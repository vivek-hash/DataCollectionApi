package com.vivek.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import com.vivek.repository.CreateCaseRepository;
import com.vivek.service.ICreateCaseService;

public class CreateCaseServiceImpl  implements ICreateCaseService{

	@Autowired
	private CreateCaseRepository repo;
	@Override
	public Integer findAppId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getCaseNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long createCaseId(Long appId) {
		// TODO Auto-generated method stub
		return null;
	}

}
