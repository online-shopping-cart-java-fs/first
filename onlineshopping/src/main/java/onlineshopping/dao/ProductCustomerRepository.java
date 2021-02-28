package onlineshopping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import onlineshopping.bean.ProductCustomer;

@Repository
public interface ProductCustomerRepository extends JpaRepository<ProductCustomer,Integer> {

}
