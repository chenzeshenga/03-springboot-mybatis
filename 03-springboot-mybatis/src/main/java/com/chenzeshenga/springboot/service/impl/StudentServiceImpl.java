package com.chenzeshenga.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chenzeshenga.springboot.mapper.UserMapper;
import com.chenzeshenga.springboot.model.User;
import com.chenzeshenga.springboot.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> getAllUser() {
		List<User> result = userMapper.getAllUser();

		return result;
	}

}
