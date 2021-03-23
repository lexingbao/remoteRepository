package com.lexing.sys.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.lexing.sys.model.User;


@Mapper
public interface UserMapper {

	public User getById(@Param("id") long id);
	public List<User> getUserByOpenId(@Param("openId") String openId);
	public int update(User user);
}
