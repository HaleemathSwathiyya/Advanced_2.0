package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.User;
import com.spring.services.UService;

@RestController
@RequestMapping("/api")
public class UController {
	
	@Autowired
	private UService uservice;
	
	@PostMapping("/create")
	public User addValues(@RequestBody User user) {
		return uservice.addValue(user);
	}
	
	@GetMapping("/retrieveAll")
	public List<User> getValues() {
		return uservice.getValue();
	}
	

}
