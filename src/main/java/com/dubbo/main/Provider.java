package com.dubbo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "application_dubbo.xml" });
		context.start();

		System.out.println("dubbo-provider");
		System.in.read();//
	}
}
