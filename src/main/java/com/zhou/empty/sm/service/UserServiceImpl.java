package com.zhou.empty.sm.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zhou.empty.sm.dao.UserDao;
import com.zhou.empty.sm.entity.User;

@Component("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Override
	public void save(User user) {
		logger.debug("save user:account={}, name={}, firstName = {}, lastName = {}, age = {}, gender = {}", 
				new Object[]{
					user.getAccount(),
					user.getName(),
					user.getFirstName(),
					user.getLastName(),
					user.getAge(),
					user.getGender()
				});
		userDao.save(user);
	}

}
