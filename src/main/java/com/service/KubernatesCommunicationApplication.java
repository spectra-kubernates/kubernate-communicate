package com.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.service.proxy")
@EnableDiscoveryClient//Change
public class KubernatesCommunicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(KubernatesCommunicationApplication.class, args);
	}

}
