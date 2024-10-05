package com.main.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.main.Service.UserService;
import com.main.Service.Impl.UserServiceImpl;

@Configuration
public class AppConfig {

	@Bean
	public UserService userService() {
		return new UserServiceImpl();
		
	}
}
