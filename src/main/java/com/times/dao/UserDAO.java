package com.times.dao;

import java.util.List;

import org.h2.engine.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.times.model.Category;
import com.times.model.User;

/*@Transactional
@Repository
public class UserDAO {

	@Autowired
	SessionFactory sessionFactory;
	public List displayUser()
	{
		Session session=sessionFactory.openSession();
		Transaction tx=session.getTransaction();
		tx.begin();
		List showUs=session
		
	}
	
}*/
