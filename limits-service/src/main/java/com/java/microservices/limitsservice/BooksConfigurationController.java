package com.java.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.microservices.limitsservice.bean.LimitConfiguration;


@RestController
public class BooksConfigurationController {
	@Autowired
	private Configuration configuration;

	@GetMapping("/books")
	public LimitConfiguration retriveLimitsFromConfigurations() {
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum(), configuration.getBooknames(), configuration.getBookprices());
	}

}
