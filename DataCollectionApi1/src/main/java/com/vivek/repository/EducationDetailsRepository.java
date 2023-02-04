package com.vivek.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vivek.binding.EducationDetails;

public interface EducationDetailsRepository extends JpaRepository<EducationDetails, Serializable> {

	
}
