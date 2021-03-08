package onlineshopping.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import onlineshopping.bean.ProductItem;

@Repository
public class ProductItemDao {

	@Autowired
	EntityManagerFactory factory;
	
	public List<ProductItem> getAllProductsByCategory(int itemid) {
		
		List<ProductItem> listOfPiByCat=new ArrayList<>();
		EntityManager manager  = factory.createEntityManager();
		Query qry =manager.createNativeQuery("select p.pid,p.pname,p.price,i.itemname from product p, item i where p.piid=i.itemid and i.itemid = :itemid");
		qry.setParameter("itemid", itemid);
		List<?> list = qry.getResultList();
		Iterator<?> it=list.iterator();
		while(it.hasNext()) {
			Object obj[]=(Object[]) it.next();
			ProductItem pi=new ProductItem();
			pi.setPid((int) obj[0]);
			pi.setPname((String) obj[1]);
			pi.setPrice((float) obj[2]);
			pi.setItemname((String) obj[3]);
			listOfPiByCat.add(pi);
		}
		return listOfPiByCat;
		
	}
	
	public List<ProductItem> getAllProducts() {
		
		List<ProductItem> listOfPi=new ArrayList<>();
		EntityManager manager  = factory.createEntityManager();
		Query qry =manager.createNativeQuery("select p.pid,p.pname,p.price,i.itemname from product p, item i where p.piid=i.itemid");
		List<?> list = qry.getResultList();
		Iterator<?> it=list.iterator();
		while(it.hasNext()) {
			Object obj[]=(Object[]) it.next();
			ProductItem pi=new ProductItem();
			pi.setPid((int) obj[0]);
			pi.setPname((String) obj[1]);
			pi.setPrice((float) obj[2]);
			pi.setItemname((String) obj[3]);
			listOfPi.add(pi);
		}
		return listOfPi;
	}

}
