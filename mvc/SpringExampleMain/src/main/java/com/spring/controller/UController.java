package com.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.User;
import com.spring.services.UService;

@RestController
@RequestMapping("/user")
public class UController {
	
	@Autowired
	UService uservice;
	
	@PostMapping("/create")
	public User addValues(@RequestBody User user) {
		return uservice.addValue(user);
	}
	
	@GetMapping("/retrieveAll")
	public List<User> getValues() {
		return uservice.getValue();
	}
	
	@GetMapping("/retrieve/{id}")
	public Optional <User> getByID(@PathVariable long id) {
		return uservice.getByID(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public Optional<User> deleteByID(@PathVariable long id) {
		return uservice.deleteByID(id);
	}
	
	@PutMapping("/update")
	public User updateUser(@RequestBody User user) {
		return uservice.updateUser(user);
	}

}
