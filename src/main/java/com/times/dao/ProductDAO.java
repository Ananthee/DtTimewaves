package com.times.dao;

import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;
import com.times.model.Category;
import com.times.model.Product;


@Repository
public class ProductDAO
{
@Autowired
SessionFactory sessionFactory;


public void addProduct(Product p)
{
System.out.println("Product DAO");
System.out.println(p.getProductId());
System.out.println(p.getProductName());
try
{
		Session session=sessionFactory.openSession();
		Transaction tx=session.getTransaction();
		tx.begin();
		session.save(p);
		tx.commit();
		session.flush();
		session.close();
}
catch(Exception e)
	{
		System.out.println("Error"+e);
	}
}

public List showProduct()
{
		Session session=sessionFactory.openSession();
		List showprod=session.createQuery("FROM Product").list();
		return showprod;
}
public Product getproductdata(String samplecat)
{
		Session s = sessionFactory.openSession();
		Product c=(Product)s.get(Product.class,samplecat);
        System.out.println(c);
        return c;
}

public Product showProduct(String showprod)
{
		Session session = sessionFactory.openSession();
		Product p=(Product)session.get(Product.class,showprod);
		System.out.println(p);
		return p;
}
public String[] showcategsupp()
{
		Session session=sessionFactory.openSession();
		Transaction tx=session.getTransaction();
		tx.begin();
		List showcat=session.createQuery("from Category").list();
		List showsup=session.createQuery("from Supplier").list();
		tx.commit();
		session.flush();
		session.clear();
		session.close();
		Gson g=new Gson();
		String[] cat=new String[2];
		cat[0]=g.toJson(showcat);
		cat[1]=g.toJson(showsup);
		return cat;
}

public void editProduct(Product p)
{
		Session session=sessionFactory.openSession();
		Transaction tx=session.getTransaction();
		tx.begin();
		Product prod=(Product)session.get(Product.class,p.getProductId());
		prod.setCategoryId(p.getCategoryId());
		prod.setProductId(p.getProductId());
		prod.setDescription(p.getDescription());
		prod.setSupplierId(p.getSupplierId());
		prod.setPrice(p.getPrice());
		prod.setQuantity(p.getQuantity());
		session.update(prod);
		tx.commit();
		
}
public void deleteProduct(String delprodid)
{
		Session session = sessionFactory.openSession();
		Transaction tx  = session.getTransaction();
		tx.begin();
		Product p=(Product)session.get(Product.class,delprodid);
		System.out.println(p);
        session.delete(p); 
        tx.commit();
        
}

// product description page

}

