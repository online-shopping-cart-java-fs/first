package onlineshopping.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import onlineshopping.bean.Orders;



@Repository
public interface OrderRepository extends JpaRepository<Orders,Integer>{

	

}
