package onlineshopping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import onlineshopping.bean.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer>{

}
