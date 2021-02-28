package onlineshopping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import onlineshopping.bean.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {

}
