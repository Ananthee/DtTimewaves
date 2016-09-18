package com.times.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

//import com.times.model.Category;
import com.times.model.LoginCredentials;
import com.times.model.RegisterDetails;

@Transactional
@Repository

public class RegisterDAO {
	@Autowired
	SessionFactory sessionFactory;
	public void addUser(RegisterDetails reg)
	{
		System.out.println("Registering DAO ");
		System.out.println(reg.getUserName());
		LoginCredentials lc=new LoginCredentials();
		lc.setUsername(reg.getUserName());
		lc.setPassword(reg.getPassword());
		System.out.println("Login Credentials");
		try
		{
		 Session session=sessionFactory.openSession();
		 Transaction tx=session.beginTransaction();
		 //tx.begin();
		 session.save(reg);
		 session.save(lc);
		 tx.commit();
		 session.flush();
		 session.close();
	    }
		catch(Exception ex)
		{
			System.out.println("Error " +ex);
		}
	
	}
	
	public LoginCredentials getInfo(String lc)
	{
		Session session=sessionFactory.openSession();
		Transaction tx=session.getTransaction();
		tx.begin();
		LoginCredentials logobj=(LoginCredentials)session.get(LoginCredentials.class, lc);
		System.out.println(logobj.getUsername());
		tx.commit();
		return logobj;
	}
}
