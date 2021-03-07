package onlineshopping.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class JoinDao {
	@Autowired
	EntityManagerFactory emf;

	
	public List<Object[]> getCustomerAddressInfo(String username) {
		EntityManager manager  = emf.createEntityManager();
Query qry =
manager.createNativeQuery("select c.username,c.custname,ad.addid,ad.streetname,ad.city,ad.state,ad.pin from customer c,address ad where c.username=ad.username and c.username = :username");
		
		qry.setParameter("username", username);
		List<Object[]> list = qry.getResultList();
		return list;
}
	
	
	
	public List<Object[]> getCustomerOrdersInfo(String username) {
		EntityManager manager  = emf.createEntityManager();
		
		
Query qry =
manager.createNativeQuery("select c.username,c.custname,o.orderid,o.orderdate,p.pid,p.pname,p.price from customer c join orders o on c.username=o.username join product p on o.pid=p.pid and c.username = :username");
		
		qry.setParameter("username", username);

		List<Object[]> list = qry.getResultList();
	
	
		return list;
}

}
