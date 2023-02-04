package com.vivek.binding;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Income_Details")
public class IncomeDetails {

	private Long caseNumber;
	private Double monthlyIncome;
	private Double rentIncome;
	private Double propertyIncome;
	
}
