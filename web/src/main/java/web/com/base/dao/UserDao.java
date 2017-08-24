package web.com.base.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import web.com.base.entity.User;

@Repository
public interface UserDao {

	User findById(@Param("id")int userId);
	
	User findByPhone(@Param("phone")String phone);
	
	User findByName(@Param("name")String name);
	
}
