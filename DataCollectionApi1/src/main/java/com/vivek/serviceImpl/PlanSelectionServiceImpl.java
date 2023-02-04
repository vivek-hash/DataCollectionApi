package com.vivek.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.vivek.binding.PlanSelection;
import com.vivek.repository.PlanSelectionRepository;
import com.vivek.service.PlanSelectionService;

public class PlanSelectionServiceImpl implements PlanSelectionService {

	@Autowired
	private PlanSelectionRepository repo;
	@Override
	public String savePlan(PlanSelection plan) {
		
		
		return null;
	}

}
