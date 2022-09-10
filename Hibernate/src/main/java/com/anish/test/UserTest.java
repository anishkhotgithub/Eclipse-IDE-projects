package com.anish.test;

import com.anish.doa.UserDOA;
import com.anish.doaimpl.UserDOAImpl;
import com.anish.model.User;

public class UserTest 
{
	public static void main(String args[])
	{
		UserDOA udi=new UserDOAImpl();
		User u=new User(123,"Anish","anishkhot2000@gmail.com","Pass@123");
		udi.addUser(u);
	}
	
	
}
