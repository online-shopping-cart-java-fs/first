package onlineshopping.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "onlineshopping")
@EntityScan(basePackages = "onlineshopping.bean")
@EnableJpaRepositories(basePackages = "onlineshopping")
public class OnlineShopping1Application {

	public static void main(String[] args) {
		SpringApplication.run(OnlineShopping1Application.class, args);
		System.out.println("server started....");
	}

}
