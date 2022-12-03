package com.dbms1.demo.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbms1.demo.controller.bean.user;
import com.dbms1.demo.dao.Userdao;
import com.dbms1.demo.service.userService;


@Service
public class userimple implements userService {
	
	@Autowired
	Userdao userDao;
	
	@Override
	public user getUserByUserId(String userId) {
		user User=userDao.getUserById(userId);
		return User;
		
	}
	

}
