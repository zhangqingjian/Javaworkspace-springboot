package com.yo.boot.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
 

@SpringBootApplication
@EnableEurekaServer
public class MainApplication
{
	@Bean
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}

	public static void main(String[] args)
	{
		SpringApplication.run(MainApplication.class, args);
	}
}
