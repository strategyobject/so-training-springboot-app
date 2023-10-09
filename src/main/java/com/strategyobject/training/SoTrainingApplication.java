package com.strategyobject.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SoTrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoTrainingApplication.class, args);
	}

}
