package onlineshopping.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages= "onlineshopping")
@EntityScan(basePackages= "onlineshopping.bean")
@EnableJpaRepositories(basePackages="onlineshopping")
@EnableSwagger2
public class OnlineShoppingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineShoppingApplication.class, args);
		System.err.println("Welcome to Online Shopping");
	}

}
