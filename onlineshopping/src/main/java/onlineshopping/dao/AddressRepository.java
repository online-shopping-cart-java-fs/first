package onlineshopping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import onlineshopping.bean.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address,Integer> {

}
