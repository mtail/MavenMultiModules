package com.cba.srv;

import java.util.List;

import com.cba.domain.User;

public interface IUserDao {

	public List<User> getUsers();
}
