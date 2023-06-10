package com.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.User;
import com.spring.repository.UInterface;

@Service
public class UService{
	
	@Autowired
	UInterface repo;

	public User addValue(User user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}

	public List<User> getValue() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
}
