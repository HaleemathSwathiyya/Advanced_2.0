package com.ust.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppConfig {
	
	@Autowired
	private ENVDetails envDetails;
	
	@Bean
	@Profile("dev")
	public ENVDetails devEnv() {
		System.out.println("Dev Environment");
		System.out.println(envDetails);
		return envDetails;
	}
	
	@Bean
	@Profile("test")
	public ENVDetails testEnv() {
		System.out.println("Test Environment");
		System.out.println(envDetails);
		return envDetails;
	}
	
	@Bean
	@Profile("prod")
	public ENVDetails prodEnv() {
		System.out.println("Prod Environment");
		System.out.println(envDetails);
		return envDetails;
	}

}
