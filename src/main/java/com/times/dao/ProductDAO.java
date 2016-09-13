package com.times.dao;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.times.model.Category;
import com.times.model.Product;

@Repository

/*public class ProductDAO {
	List<Product> proList=new ArrayList<Product>();
	public String disp_product()
	{
		Gson gson=new Gson();
		proList.add(new Product("Ti01","Titan","Sp01",25,2000,"Leather watch","Strap type"));
		proList.add(new Product("So01","Sonata","Sp02",50,2000,"Fossil klein watch","bracelet type"));
		proList.add(new Product("Ro01","Rollex","Sp03",25,2000,"Jwel statinless steel","Strap type"));
		proList.add(new Product("Qu01","Quartz","Sp04",25,2000,"stella","Strap type"));
		String jsonToString=gson.toJson(proList);
		return jsonToString;
	}
	}*/
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
			Transaction tx=session.beginTransaction();
			tx.begin();
			session.save(p);
			session.flush();
			tx.commit();
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
		Transaction tx=session.getTransaction();
		tx.begin();
		List showprod=session.createQuery("from Product").list();
		session.flush();
		tx.commit();
		session.close();
		return showprod;
}
public Product showProduct(String showprod)
{
		Session session = sessionFactory.openSession();
		Transaction tx = session.getTransaction();
		tx.begin();
		Product p=(Product)session.get(Product.class,showprod);
		session.flush();
		tx.commit();
		session.close();
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
		//session.close();
		Gson g=new Gson();
		String[] cat=new String[2];
		cat[0]=g.toJson(showcat);
		cat[1]=g.toJson(showsup);
		session.close();
		return cat;
}
public void editProduct(Product editprod)
{
		Session s=sessionFactory.openSession();
		Transaction tx=s.getTransaction();
		tx.begin();
		//Product p=(Product)s.get(Category.class,editprod.getProductId());
		Product p=(Product) s.get(Category.class, editprod.getProductId());
		p.setProductName(editprod.getProductName());
		p.setProductName(editprod.getProductName());
		//need to add some more code
		s.update(p);
		tx.commit();
}
public void deleteProduct(int delprodid)
{
		Session session = sessionFactory.openSession();
		Transaction tx = session.getTransaction();
		tx.begin();
		Product p=(Product)session.get(Product.class,delprodid);
		System.out.println(p);
        session.delete(p); 
        tx.commit();
}
}

