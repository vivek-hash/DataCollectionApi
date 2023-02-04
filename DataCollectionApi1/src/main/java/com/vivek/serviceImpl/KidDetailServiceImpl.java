package com.vivek.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.vivek.binding.KidDetails;
import com.vivek.repository.KidsDetailsRepository;
import com.vivek.service.IKidDetailService;

public class KidDetailServiceImpl implements IKidDetailService {

	@Autowired
	private KidsDetailsRepository repo;
	@Override
	public String saveKidsDetails(KidDetails kidDetails) {
	
		return null;
	}

}
