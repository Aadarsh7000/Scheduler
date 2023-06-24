package com.yash.sheduler.dao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.scheduler.beans.Tasks;

public interface TaskDao {

	boolean find(Tasks task);
	void delete(int id);
	void update(Tasks task);
	int save(Tasks task ,String userEmail);
}
