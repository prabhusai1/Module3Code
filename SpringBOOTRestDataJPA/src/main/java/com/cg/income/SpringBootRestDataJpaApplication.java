package com.cg.income;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.cg.income.controller")
@ComponentScan("com.cg.income.dao")
@ComponentScan("com.cg.income.service")
@ComponentScan("com.cg.income.model")
@EntityScan(basePackages = {"com.cg.income"})
@SpringBootApplication
public class SpringBootRestDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestDataJpaApplication.class, args);
	}

}







