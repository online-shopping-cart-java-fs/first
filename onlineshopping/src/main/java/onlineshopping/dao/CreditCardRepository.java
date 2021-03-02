package onlineshopping.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import onlineshopping.bean.CreditCard;

@Repository
public interface CreditCardRepository extends JpaRepository<CreditCard,Integer> {

}