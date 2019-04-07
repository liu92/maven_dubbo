package com.dubbo.service.impl;

import com.dubbo.service.DemoService;

public class DemoServiceImpl implements DemoService {

	@Override
	public String sayHello(String name) {
		return "Hello" + name;
	}

}
