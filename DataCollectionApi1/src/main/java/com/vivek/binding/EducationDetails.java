package com.vivek.binding;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Education_Details")
public class EducationDetails {

	private Long caseNumber;
	private List <String> highestDegree;
	private List<Integer> yearOfGraduation;
	private List<String> universityName;
}
