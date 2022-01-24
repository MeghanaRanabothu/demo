package com.example.demo.service;

import java.util.Optional;

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

	public Iterable<user> getusers() {
		return userRespository.findAll();
	}

	public Optional<user> getusers(Integer id) {
		return userRespository.findById(id);
	}

	public void deleteuser(Integer id) {
		userRespository.deleteById(id);
	}

}
