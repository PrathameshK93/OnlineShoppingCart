package com.ghostriders.osc.dao;

import com.ghostriders.osc.entity.User;

public interface UserDao {
	void addUser(User user);

	void updateUser(User user);

	User getUser(int uid);

	void deleteUser(int uid);

}
