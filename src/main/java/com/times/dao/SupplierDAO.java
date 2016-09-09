package com.times.dao;

import java.util.*;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.times.model.Category;
import com.times.model.Supplier;

@Transactional
@Repository
public class SupplierDAO {

	@Autowired
	SessionFactory sessionFactory;
	public void addSupplier(Supplier supplierId)
	 {
		 Session session=sessionFactory.openSession();
		 Transaction tx=session.getTransaction();
		 tx.begin();
		 session.save(supplierId);
		 tx.commit();	 
	 }
	/*public List showSupplier()
	{
		Session s=sessionFactory.openSession();
		Transaction tx=s.getTransaction();
		tx.begin();
		List showsup = s.createQuery("FROM Supplier").list();
		tx.commit();
		return showsup;
	}*/
	
}
