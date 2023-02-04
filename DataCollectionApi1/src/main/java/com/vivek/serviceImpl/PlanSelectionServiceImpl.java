package com.vivek.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.vivek.binding.PlanSelection;
import com.vivek.repository.PlanSelectionRepository;
import com.vivek.service.IPlanSelectionService;

public class PlanSelectionServiceImpl implements IPlanSelectionService {

	@Autowired
	private PlanSelectionRepository repo;
	@Override
	public String savePlan(PlanSelection plan) {
		
		
		return null;
	}

}
