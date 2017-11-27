package com.etoak.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.etoak.service.LoginService;

@Controller
public class LoginController {
	
	@Resource
	private LoginService loginService;
	
	public void login(String username,String password){
		try{
			loginService.login(username, password);
		}catch(RuntimeException e){
			System.out.println(e.getMessage());
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
