package onlineshopping.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import onlineshopping.bean.CustomerOrders;

@Repository
public class CustomerOrdersDao {
	
	@Autowired
	EntityManagerFactory factory;
	
	public List<CustomerOrders> getAllOrdersByCustomer(String username) {
		
		List<CustomerOrders> listOfCustOrders=new ArrayList<>();
		EntityManager manager  = factory.createEntityManager();
		Query qry =manager.createNativeQuery("select o.orderid,o.ordername,c.username,c.email,c.address,o.total from orders o, customer c where o.coid=c.username and c.username = :username");
		qry.setParameter("username", username);
		List<?> list = qry.getResultList();
		Iterator<?> it=list.iterator();
		while(it.hasNext()) {
			Object obj[]=(Object[]) it.next();
			CustomerOrders co=new CustomerOrders();
			co.setOrderid((int) obj[0]);
			co.setOrdername((String) obj[1]);
			co.setUsername((String) obj[2]);
			co.setEmail((String) obj[3]);
			//co.setMobnum((long) obj[4]);
			co.setAddress((String) obj[4]);
			co.setTotal((float) obj[5]);
			listOfCustOrders.add(co);
		}
		return listOfCustOrders;
		
	}

}
