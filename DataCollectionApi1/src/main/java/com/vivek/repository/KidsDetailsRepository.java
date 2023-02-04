package com.vivek.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vivek.binding.KidDetails;

public interface KidsDetailsRepository extends JpaRepository<KidDetails, Serializable> {

}
