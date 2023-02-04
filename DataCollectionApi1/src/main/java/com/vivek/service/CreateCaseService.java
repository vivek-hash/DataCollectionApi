package com.vivek.service;

public interface CreateCaseService {

	public Integer findAppId();
	public Long getCaseNumber();
	public Long createCaseId(Long appId);
}
