package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.entity.User;
@Repository
public interface UInterface extends JpaRepository<User,Integer>{

}
