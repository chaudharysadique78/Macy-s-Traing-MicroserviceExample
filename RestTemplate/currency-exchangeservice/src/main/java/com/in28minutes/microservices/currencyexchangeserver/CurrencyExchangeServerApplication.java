package com.in28minutes.microservices.currencyexchangeserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class CurrencyExchangeServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeServerApplication.class, args);
	}

}
