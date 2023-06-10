package com.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.User;
import com.spring.repository.UInterface;

//
//import com.spring.entity.User;
//import com.spring.repository.UInterface;

@Service
public class UService {
	
	@Autowired
	UInterface repo;

	public User addValue(User user) {
		
		return repo.save(user);
	}

	public List<User> getValue() {
		
		return repo.findAll();
	}

	public Optional <User> getByID(long id) {
		Optional<User> op = repo.findById(id);
		if(op!=null) {
			return op;
		}
		else {
			return null;
		}
	
	}

	public Optional<User> deleteByID(long id) {	
		Optional<User> user = repo.findById(id);
		repo.deleteById(id);
		return user;
		}

	public User updateUser(User user) {		
		User u = null;
		Optional<User> op = repo.findById(user.getId());
		if(op.isPresent()) {
			u = op.get();
			u.setName(user.getName());
			u.setAge(user.getAge());
			repo.save(user);
		}
		else {
			return repo.save(user);
		}
		
		return u;
	}
		

}
