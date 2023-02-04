package com.vivek.service;

public interface ICreateCaseService {

	public Integer findAppId();
	public Long getCaseNumber();
	public Long createCaseId(Long appId);
}
