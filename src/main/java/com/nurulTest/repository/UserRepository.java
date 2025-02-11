package com.nurulTest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nurulTest.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	
	User findByUserId(Long userId);

	User findByUserNameAndAddress(String userName, String userAddress);

	List<User> getAllUser();

}
