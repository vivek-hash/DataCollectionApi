package com.vivek.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vivek.binding.CreateCase;

public interface CreateCaseRepository extends JpaRepository<CreateCase, Long> {

}
