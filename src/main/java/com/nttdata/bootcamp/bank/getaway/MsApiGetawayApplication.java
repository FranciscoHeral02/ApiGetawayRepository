package com.nttdata.bootcamp.bank.getaway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsApiGetawayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsApiGetawayApplication.class, args);
	}

}
