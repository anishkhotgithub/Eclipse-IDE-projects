package com.anish.doaimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.anish.dbconfig.DbConfig;
import com.anish.doa.UserDOA;
import com.anish.model.User;

public class UserDOAImpl implements UserDOA
{

	@Override
	public boolean addUser(User user) 
	{
		Transaction tx=null;
		try
		{
			Session session= DbConfig.getSession();
			tx=session.beginTransaction();
			session.save(user);
			tx.commit();
			return true;
		}
		catch (Exception e) 
		{
			System.out.println(e);
			tx.rollback();
			return false;
		}
	}
	@Override
	public boolean updateUser(User user)
	{
		Transaction tx=null;
		try
		{
			Session session= DbConfig.getSession();
			tx=session.beginTransaction();
			session.saveOrUpdate(user);
			tx.commit();
			return true;
		}
		catch (Exception e) 
		{
			System.out.println(e);
			tx.rollback();
			return false;
		}

	}

	@Override
	public boolean deleteUser(User user)
	{
		Transaction tx=null;
		try
		{
			Session session= DbConfig.getSession();
			tx=session.beginTransaction();
			session.delete(user);
			tx.commit();
			return true;
		}
		catch (Exception e) 
		{
			System.out.println(e);
			tx.rollback();
			return false;
		}

	}

	@Override
	public List<User> displayUser() 
	{
		Transaction tx=null;
		try
		{
			Session session = DbConfig.getSession();
			return session.createQuery("from com.anish.model.User").list();
		}
		catch (Exception e) 
		{
			System.out.println(e);
			tx.rollback();
			return null;
			
		}
	}
	
}
