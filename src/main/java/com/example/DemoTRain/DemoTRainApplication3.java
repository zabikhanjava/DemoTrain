package com.example.DemoTRain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.DemoTRain.service.DemoServiceImpl2;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableTransactionManagement
@EnableSwagger2
public class DemoTRainApplication3 {

	public static void main(String[] args) {
		SpringApplication.run(DemoTRainApplication3.class, args);

	}

	@Bean
	public DemoServiceImpl2 pop() {
		return new DemoServiceImpl2();
	}

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.example.DemoTRain")).build();
	}
}