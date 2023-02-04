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
@Table(name="Kid_Details")
public class KidDetails {

	private Integer kidId;
	private Long caseNumber;
	private String kidName;
	private Double kidAge;
	private Long kidSsn;
}
