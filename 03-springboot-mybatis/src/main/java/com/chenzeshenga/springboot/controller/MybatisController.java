package com.chenzeshenga.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chenzeshenga.springboot.service.StudentService;

@RestController
public class MybatisController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/boot/students")
	public Object students() {

		return studentService.getAllUser();
	}

}
