package com.etoak.dao.impl;

import org.springframework.stereotype.Repository;

import com.etoak.dao.LoginDao;

@Repository
public class LoginDaoImpl implements LoginDao {

	@Override
	public String login(String username, String password) {
		System.out.println("ÓÃ»§Ãû:"+username);
		System.out.println("ÃÜÂë:"+password);
		
		return username+"|" + password;
	}

}
