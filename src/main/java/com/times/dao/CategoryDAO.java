package com.times.dao;


import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.times.model.Category;

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
		 tx.commit();	 
	 }
	 public List displayCategory()
	 {
		 Session session=sessionFactory.openSession();
		 Transaction tx=session.getTransaction();
		 tx.begin(); 
		 List category=(List<Category>)session.createQuery("from Category");
		 tx.commit();	 
		 return category;
	 }
	 public void deleteCatagory(int samplecat)
	 {
		Session session = sessionFactory.openSession();
		Transaction tx = session.getTransaction();
	    tx.begin();
        Category c=(Category)session.get(Category.class,samplecat);
        System.out.println(c);
        session.delete(c); 
        tx.commit();
	}
	 
}
