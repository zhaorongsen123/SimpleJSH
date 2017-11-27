package com.etoak.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.etoak.controller.LoginController;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		LoginController lc = (LoginController)ac.getBean("loginController");
		lc.login("etoak", "et1704");

	}

}
