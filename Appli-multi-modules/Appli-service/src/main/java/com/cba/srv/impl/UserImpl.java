package com.cba.srv.impl;

import java.util.List;

import com.cba.domain.User;
import com.cba.srv.IUserDao;
import com.cba.srv.IUserSrv;

public class UserImpl implements IUserSrv {

	private IUserDao userDao;

	public UserImpl() {
		userDao = new UserDaoImpl();
	}

	public List<User> getUsers() {

		return userDao.getUsers();
	}

}
