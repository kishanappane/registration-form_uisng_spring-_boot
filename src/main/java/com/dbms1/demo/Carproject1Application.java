package com.dbms1.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.dbms1.demo")
@EnableJpaRepositories(basePackages= "com.dbms1.demo.repository")
public class Carproject1Application {

	public static void main(String[] args) {
		SpringApplication.run(Carproject1Application.class, args);
	}

}
