package com.anish.dbconfig;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.anish.model.User;

public class DbConfig 
{
	private static SessionFactory factory=null;
	public static SessionFactory getFactory() 
	{
		return factory;
	}
	public static void setfactory(SessionFactory factory)
	{
		DbConfig.factory=factory;
	}
	static
	{
		try
		{
			loadSession();
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
	public static void loadSession() 
	{
		Configuration conf= new Configuration();
		conf.configure("hibernate.cfg.xml");
		conf.addAnnotatedClass(User.class);
		ServiceRegistry registry=new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
		setfactory(conf.buildSessionFactory(registry));
	}
	public static Session getSession()
	{
		return getFactory().openSession();
	}
}
