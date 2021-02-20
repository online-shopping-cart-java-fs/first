package onlineshopping.main;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import onlineshopping.bean.Customer;
import onlineshopping.service.CustomerService;

@SpringBootApplication(scanBasePackages = "onlineshopping") //by default scan  current package or sub package of current package
@EntityScan(basePackages = "onlineshopping.bean")
@EnableJpaRepositories(basePackages = "onlineshopping")
public class OnlineShoppingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineShoppingApplication.class, args);
		System.out.println("server started");
	}

}
