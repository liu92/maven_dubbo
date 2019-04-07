package com.dubbo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dubbo.service.DemoService;

public class Demo {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "dubbo-consumer.xml" });
		context.start();
		DemoService demoService = (DemoService) context.getBean("demoService");
		String hello = demoService.sayHello("dubboces");

		System.out.println(Thread.currentThread().getName() + " " + hello);
	}
}
