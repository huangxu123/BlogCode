package web.com.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import web.com.base.dao.UserDao;
import web.com.base.entity.User;
import web.com.base.service.UserService;

@Component
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;

	public User findById(int userId) {
		return userDao.findById(userId);  
	}

	public User findByPhone(String phone) {
		return userDao.findByPhone(phone);
	}

	public User findByName(String name) {
		return userDao.findByName(name);
	}

}
