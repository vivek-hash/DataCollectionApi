package com.vivek.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vivek.binding.IncomeDetails;

public interface IncomeDetailsRepository extends JpaRepository<IncomeDetails, Serializable> {

}
