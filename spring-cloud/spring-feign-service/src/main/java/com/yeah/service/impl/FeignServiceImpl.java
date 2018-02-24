package com.yeah.service.impl;

import org.springframework.stereotype.Component;

import com.yeah.service.FeignService;
@Component
public class FeignServiceImpl implements FeignService {

	@Override
	public String sayHiFromClientOne(String name) {
		return "sorry "+name;
	}

}
