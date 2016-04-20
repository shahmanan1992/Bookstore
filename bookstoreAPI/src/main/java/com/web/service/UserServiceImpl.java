package com.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.web.dao.UserDao;
import com.web.entity.User;
import com.web.model.UserModel;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	
	@Transactional
	public void addUser(UserModel userModel) {
		User user = new User();
		userDao.addUser(user);
	}

}
