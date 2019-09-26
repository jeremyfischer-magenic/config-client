package com.magenic.spring.config.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
	
	@Autowired
	private Environment environment;

	@RequestMapping(value = "/config/{key}", method = RequestMethod.GET)
	public @ResponseBody String getConfig(@PathVariable String key) {
		return environment.getProperty(key);
	}
}
