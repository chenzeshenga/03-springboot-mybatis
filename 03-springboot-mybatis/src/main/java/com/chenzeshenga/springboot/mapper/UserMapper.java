package com.chenzeshenga.springboot.mapper;

import com.chenzeshenga.springboot.model.User;
import com.chenzeshenga.springboot.model.UserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
	long countByExample(UserExample example);

	int deleteByExample(UserExample example);

	int insert(User record);

	int insertSelective(User record);

	List<User> selectByExample(UserExample example);

	int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

	int updateByExample(@Param("record") User record, @Param("example") UserExample example);

	List<User> getAllUser();
}