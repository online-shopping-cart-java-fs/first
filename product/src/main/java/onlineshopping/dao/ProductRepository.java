package onlineshopping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import onlineshopping.bean.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
