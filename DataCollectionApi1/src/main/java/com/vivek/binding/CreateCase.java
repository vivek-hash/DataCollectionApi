package com.vivek.binding;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
public class CreateCase {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long CaseNumber;
}
