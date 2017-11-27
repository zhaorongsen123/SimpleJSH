package com.etoak.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etoak.dao.LoginDao;
import com.etoak.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDao loginDao;
	
	@Override
	public void login(String username, String password) {
		if(username == null || "".equals(username)){
			throw new RuntimeException("�û���Ϊ�գ�");
		}
		if(password==null || "".equals(password)){
			throw new RuntimeException("����Ϊ�գ�");
		}
		String result = loginDao.login(username, password);
		System.out.println("dao�㷵����Ϣ:"+result);
		
	}

}
