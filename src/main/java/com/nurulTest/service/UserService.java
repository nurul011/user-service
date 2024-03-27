package com.nurulTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nurulTest.entity.User;
import com.nurulTest.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;

	public User saveUser(User user) {
		System.out.println("inside save in UserService");
		return userRepository.save(user) ;
	}

	public User findUserById(Long userId) {
		System.out.println("inside save in UserService");
		return userRepository.findByUserId(userId);
	}

	
	public User findUserByNmaeAndAddress(String userName, String userAddress) {
		
		return userRepository.findByUserNameAndAddress(userName,userAddress);
	}

	public List<User> getUserAll() {
		// TODO Auto-generated method stub
		return userRepository.getAllUser();
	}

}
