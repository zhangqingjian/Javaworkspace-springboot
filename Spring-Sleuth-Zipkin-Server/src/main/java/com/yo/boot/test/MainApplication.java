package com.yo.boot.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class MainApplication
{
	 

	public static void main(String[] args)
	{
		SpringApplication.run(MainApplication.class, args);
	}
}
