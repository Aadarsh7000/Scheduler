package com.yash.sheduler.dao;

import com.yash.scheduler.beans.User;

public interface UserDao {

	int save(User user);

	int update(User user);

	int delete(Long id);

	boolean find(User user);
	
}
