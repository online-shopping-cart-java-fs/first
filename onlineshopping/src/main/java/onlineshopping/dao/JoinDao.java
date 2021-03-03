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

	public List<Object[]> getCustomerAccountDetails(int custid) {
						EntityManager manager  = emf.createEntityManager();
			Query qry =
	manager.createNativeQuery("select c.custid,c.custname,cc.creditcardnum,cc.accnum,cc.debitnum from customer c,creditcard cc where c.custid=cc.custid and c.custid = :custId");
						
						qry.setParameter("custId", custid);
						List<Object[]> list = qry.getResultList();
						return list;
	}
	
	public List<Object[]> getCustomerAddressInfo(int custid) {
		EntityManager manager  = emf.createEntityManager();
Query qry =
manager.createNativeQuery("select c.custid,c.custname,ad.addid,ad.streetname,ad.city,ad.state,ad.pin from customer c,address ad where c.custid=ad.custid and c.custid = :custId");
		
		qry.setParameter("custId", custid);
		List<Object[]> list = qry.getResultList();
		return list;
}
}
