package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo.UserRepository;
import com.example.demo.entity.user;
@Service
public class IUserService {

	@Autowired
	UserRepository userRespository;
	
	public void save(user User) {
			
		userRespository.save(User);
	}

}
