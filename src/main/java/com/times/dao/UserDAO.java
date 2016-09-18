package com.times.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.times.model.User;
import com.times.model.User;


@Transactional
@Repository
public class UserDAO {

	@Autowired
	SessionFactory sessionFactory;
	public void addUser(User userId)
	{
		Session session=sessionFactory.openSession();
		Transaction tx=session.getTransaction();
		tx.begin();
		session.save(userId);
		session.flush();
		tx.commit();
		
	}
	public List displayUser()
	{
		Session session=sessionFactory.openSession();
		Transaction tx=session.getTransaction();
		tx.begin();
		List showUser = session.createQuery("FROM User").list();
		tx.commit();
		return showUser;
	}
	
	public void editUser(User c)
	 {
		Session session=sessionFactory.openSession();
		Transaction tx=	session.getTransaction();
		tx.begin();
		User cat=(User)session.get(User.class,c.getUserId());
		cat.setUserId(c.getUserId());
		cat.setCustomerName(c.getCustomerName());
		cat.setAddress(c.getAddress());
		session.update(cat);
		tx.commit();
	 }
	public void delUser(String sampleuser)
	{
		Session session = sessionFactory.openSession();
		Transaction tx = session.getTransaction();
	    tx.begin();
        User cat=(User)session.get(User.class,sampleuser);
        System.out.println(cat.getUserId());
        session.delete(cat); 
        session.flush();
        tx.commit();
	}
	
}