package com.example.demo; 
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.user;

public interface UserRepository extends CrudRepository <user, Integer> {

}
