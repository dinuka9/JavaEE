package com.esoft.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esoft.dao.LoginDAO;
import com.esoft.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	private LoginDAO loginDAO;
	
	@Transactional
	public String varifyUser(String username, String password) {
		return loginDAO.varifyUser(username, password);
	}
	
}
