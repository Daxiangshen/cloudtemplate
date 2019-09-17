package com.cloudtemplate;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.cloudtemplate.infrastructure.mapper")
public class CloudtemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudtemplateApplication.class, args);
	}

}
