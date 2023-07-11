package com.hublance.testhublance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestTesthublanceApplication {

	public static void main(String[] args) {
		SpringApplication.from(TesthublanceApplication::main).with(TestTesthublanceApplication.class).run(args);
	}

}
