package com.magenic.spring.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Configuration
	class SecurityConfiguration extends WebSecurityConfigurerAdapter {

		  @Override
		  protected void configure(HttpSecurity http) throws Exception {
		    http
		        .authorizeRequests().anyRequest().permitAll()
		        .and()
		        .httpBasic().disable()
		        .csrf().disable();
		  }

	}
	
}
