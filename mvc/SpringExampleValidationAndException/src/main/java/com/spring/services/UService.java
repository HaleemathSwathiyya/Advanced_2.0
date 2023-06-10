package com.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.spring.entity.User;
import com.spring.exception.UserNotFoundException;
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

	public Optional <User> getByID(long id) throws UserNotFoundException{
		Optional<User> op = repo.findById(id);
		if(op.isPresent()) {
			return op;
		}
		else {
//			return null;
			throw new UserNotFoundException("user not found with id :" +id);
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
