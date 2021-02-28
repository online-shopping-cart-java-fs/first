package onlineshopping.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductItemDao {

	@Autowired
	EntityManagerFactory factory;
	
	public List<Object[]> getAllProductsByCategory(int itemid) {
		
		EntityManager manager  = factory.createEntityManager();
		Query qry =manager.createNativeQuery("select p.pid,p.pname,p.price,i.itemname from product p, item i where p.piid=i.itemid and i.itemid = :itemid");
		qry.setParameter("itemid", itemid);
		List<Object[]> list = qry.getResultList();
		return list;
}
}
