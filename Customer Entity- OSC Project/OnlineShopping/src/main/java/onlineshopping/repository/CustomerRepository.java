package onlineshopping.repository;
import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import onlineshopping.bean.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
