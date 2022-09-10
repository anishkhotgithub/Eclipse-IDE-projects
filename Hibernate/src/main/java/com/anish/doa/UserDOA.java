package com.anish.doa;

import java.util.List;

import com.anish.model.User;



public interface UserDOA 
{
	public boolean addUser(User user);
	public boolean updateUser(User user);
	public boolean deleteUser(User user);
	public List<User> displayUser();
}
