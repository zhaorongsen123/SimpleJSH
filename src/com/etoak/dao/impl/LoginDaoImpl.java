package com.etoak.dao.impl;

import org.springframework.stereotype.Repository;

import com.etoak.dao.LoginDao;

@Repository
public class LoginDaoImpl implements LoginDao {

	@Override
	public String login(String username, String password) {
		System.out.println("�û���:"+username);
		System.out.println("����:"+password);
		
		return username+"|" + password;
	}

}
