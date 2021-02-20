package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bean.CreditCard;

@Repository
public interface CreditCardRepository extends JpaRepository<CreditCard,Integer> {

}
