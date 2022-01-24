package com.example.usercontroller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.user;
import com.example.demo.service.IUserService;

@RestController
public class usercontroller {
	@Autowired
	IUserService userService;
	
	@GetMapping("/user") //search
	Iterable<user> getuser() {
		return userService.getusers();
   }

	
   @GetMapping("/user/{id}") //search by id
	Optional<user> getuser(@PathVariable("id") Integer id) {
		return userService.getusers(id);
   }
   @PostMapping("/user") //creating user
     //@ResponseStatus(code=HttpStatus.CREATED)
		 void createUser (@RequestBody @Valid user User) {
			 System.out.println(User.getName());
			 userService.save(User);
	}
 @DeleteMapping("/user/{id}")
   void deleteuser(@PathVariable("id") Integer id) {
	 userService.deleteuser(id);
	   
   }

}
