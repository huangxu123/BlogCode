package web.com.base.service;

import org.springframework.stereotype.Service;

import web.com.base.entity.User;

@Service
public interface UserService {

	User findById(int userId);
	
	User findByPhone(String phone);
	
	User findByName(String name);
	
}
