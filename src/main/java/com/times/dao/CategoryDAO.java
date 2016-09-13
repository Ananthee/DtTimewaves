package com.times.dao;


import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.times.model.Category;
import com.times.model.Supplier;

//import javassist.bytecode.Descriptor.Iterator;


@Transactional
@Repository
public class CategoryDAO 
{
	@Autowired
	SessionFactory sessionFactory;
	 public void addCategory(Category categoryId)
	 {
		 Session session=sessionFactory.openSession();
		 Transaction tx=session.getTransaction();
		 tx.begin();
		 session.save(categoryId);
		 session.flush();
		 tx.commit();	 
	 }
	 public List displayCategory()
	 {
		 Session session=sessionFactory.openSession();
		 Transaction tx=session.getTransaction();
		 tx.begin();
		 List showCat = session.createQuery("FROM Category").list();
		 tx.commit();
		 return showCat;
	 }
	 
	 public void editCategory(Category c)
	 {
		Session session=sessionFactory.openSession();
		Transaction tx=	session.getTransaction();
		tx.begin();
		Category cat=(Category)session.get(Category.class,c.getCategoryId());
		cat.setCategoryId(c.getCategoryId());
		cat.setCategoryName(c.getCategoryName());
		cat.setCategoryDesc(c.getCategoryDesc());
		session.update(cat);
		tx.commit();
			
	 }
			 
	 public void delCategory(String samplecat)
	{
		Session session = sessionFactory.openSession();
		Transaction tx = session.getTransaction();
	    tx.begin();
        Category cat=(Category)session.get(Category.class,samplecat);
        System.out.println(cat.getCategoryId());
        session.delete(cat); 
        session.flush();
        tx.commit();
	}
	 
	/* public Category viewCategory(String cat )
	 {
		Session session = sessionFactory.openSession();
		Transaction tx = session.getTransaction();
		tx.begin();
	    Category c=(Category)session.get(Category.class,cat);
	    tx.commit();
	    return c;
		 
	 }*/
}
