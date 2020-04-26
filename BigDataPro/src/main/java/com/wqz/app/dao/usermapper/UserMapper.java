package com.wqz.app.dao.usermapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;

import com.wqz.app.entity.User;

@Mapper
public interface UserMapper {
	@Results({
		@Result(property="id",column="id"),
		@Result(property="name",column="name"),
		@Result(property="age",column="age")
	})
	@Insert("insert into user(name,age) values(#{name},#{age})")
	void saveUser(User user);

}
