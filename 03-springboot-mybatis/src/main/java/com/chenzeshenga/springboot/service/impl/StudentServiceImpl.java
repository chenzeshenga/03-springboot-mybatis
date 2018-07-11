package com.chenzeshenga.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;

import com.chenzeshenga.springboot.mapper.UserMapper;
import com.chenzeshenga.springboot.model.User;
import com.chenzeshenga.springboot.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private RedisTemplate<Object, Object> redisTemplate;

	@Override
	public List<User> getAllUser() {
//		List<User> result = userMapper.getAllUser();
		RedisSerializer<String> redisSerializer = new StringRedisSerializer();
		redisTemplate.setKeySerializer(redisSerializer);

		List<User> userList = (List<User>) redisTemplate.opsForValue().get("allUsers");

		if (null == userList) {
			userList = userMapper.getAllUser();
			redisTemplate.opsForValue().set("allUsers", userList);
		}

		return userList;
	}

}
