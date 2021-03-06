package com.walissonmartins.cursomc.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.walissonmartins.cursomc.services.DBService;

@Configuration
@Profile("dev")
public class TestConfig {

	@Autowired
	private DBService dbservice;
	
	@Bean
	public boolean instantiateDatabase() throws ParseException {
		
		dbservice.instantiateTestDatabase();
		return true;
	}
}
