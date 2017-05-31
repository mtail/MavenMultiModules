package com.cba.srv.impl;

import java.util.ArrayList;
import java.util.List;

import com.cba.domain.User;
import com.cba.srv.IUserDao;

public class UserDaoImpl implements IUserDao {

	private List<User> users = new ArrayList();

	public UserDaoImpl() {
		System.out.println("---> Build UserDaoImpl ...");
		users.add(new User("1", "Mohamed"));
		users.add(new User("2", "Luck"));
		users.add(new User("3", "Karine"));
	}

	public List<User> getUsers() {

		return this.users;
	}

}
