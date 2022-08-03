package com.example.eureka.eurekanamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekanamingserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekanamingserverApplication.class, args);
	}

}
