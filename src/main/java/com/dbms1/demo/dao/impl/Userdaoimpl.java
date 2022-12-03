package com.dbms1.demo.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.dbms1.demo.controller.bean.user;
import com.dbms1.demo.dao.Userdao;

import jakarta.annotation.PostConstruct;




@Repository
public class Userdaoimpl extends JdbcDaoSupport implements Userdao {
	@Autowired
	DataSource dataSource;
	
	@PostConstruct
	public void initialize()
	{
		setDataSource(dataSource);
	}
	
	
	
	
	@Override
	public user getUserById(String userId) {
	String sql = "select cast (aes_decrypt (unhex(user_pswd`), 'secret') as char(50)) from user where user_id=?";
	return getJdbcTemplate().queryForObject(sql, new Object[] { userId}, new RowMapper<user>() {
		
		
	
	@Override
	public user mapRow (ResultSet rs, int rowNum) throws SQLException {
	user User = new user();
	User.setUserId (userId);
	User.setPassword (rs.getString(1));
	return User;
	}
	});

}
}
