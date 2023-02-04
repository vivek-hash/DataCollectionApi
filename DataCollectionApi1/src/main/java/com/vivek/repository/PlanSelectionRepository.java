package com.vivek.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vivek.binding.PlanSelection;

public interface PlanSelectionRepository extends JpaRepository<PlanSelection, Serializable> {

}
