package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com")	// by default scan current package or sub package of current package.
@EntityScan(basePackages = "com.bean")						// Scan entity classes with @Entity annotation 
@EnableJpaRepositories(basePackages = "com")	
public class OnlineShopping {

	public static void main(String[] args) {
		SpringApplication.run(OnlineShopping.class, args);	// running spring boot application 
		System.out.println("Spring boot server started....hi");
	

	}

}
