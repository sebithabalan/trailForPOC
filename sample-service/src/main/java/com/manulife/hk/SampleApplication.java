/*
 * TransactionApplication.java
 *
 * Copyright (c) 2016 Manulife International Ltd.
 *
 * Description:
 * 
 *
 * Maintenance History
 * 
 * YYMMDD Who              Reason
 * ====== ================ ====================================================
 * 170814 Cognizant       Application Development
 */
package com.manulife.hk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan("com.manulife.*")
public class SampleApplication /*extends SpringBootServletInitializer*/ {

	/*@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SampleApplication.class);
	}*/

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}
}
