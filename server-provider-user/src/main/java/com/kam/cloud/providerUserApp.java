package com.kam.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@MapperScan("com.kam.cloud.dao")
public class providerUserApp {

	public static void main(String[] args) {
		SpringApplication.run(providerUserApp.class, args);

	}
	/*
	 * dbcp2: min-idle: 5 initial-size: 5 max-total: 5 max-wait-millis: 200
	 */

}
