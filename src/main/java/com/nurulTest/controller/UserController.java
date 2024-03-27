package com.nurulTest.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.nurulTest.entity.User;
import com.nurulTest.service.UserService;

import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	
    @PostMapping("/")
	 public User saveUser(@RequestBody User user) {
		System.out.println("inside save in UserService");
		return userService.saveUser(user);
		
	}
	   @GetMapping("/{id}")
	    public User findUserById(@PathVariable("id") Long userId) {
		   System.out.println("inside findById in UserService");
		return userService.findUserById(userId);
		   
		   
	   }
	   
	    @GetMapping("/{userName},{userAddress}")
	    public User findUserByNmaeAndAddress(@PathVariable String userName,@PathVariable String userAddress ) {
			   System.out.println("inside findById in UserService");
			return userService.findUserByNmaeAndAddress(userName,userAddress);
	    
}
	    @GetMapping("/details")
	    public List<User> getUserAll() {
			   System.out.println("inside findById in UserService");
			return userService.getUserAll();

}
	    
}