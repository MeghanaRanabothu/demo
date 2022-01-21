package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.user;

@RestController
public class usercontroller {
   @GetMapping("/user")
	String getUser() {
		System.out.println("testing");
		return "testing";
   }
   @PostMapping("/user")
		 void createUser (@RequestBody user User) {
			 System.out.println(User.getName());
	}

   void deleteuser(@RequestBody user User) {
	   
   }

}
