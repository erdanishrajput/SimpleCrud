package com.main.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.main.Entities.UserEntitites;
import com.main.Repositories.UserRepo;

@Repository
public class UserDao {
	
	public UserRepo userRepo;
	//save
	public UserEntitites save(UserEntitites userEntitites) {
		
		return userRepo.save(userEntitites);
		
	}
	
	//get
	
	public UserEntitites getById(int id) {
		return userRepo.findById(id).orElseThrow(()->new RuntimeException());
		
	}
	//getAll
	public List<UserEntitites> getAllUser() {
		return userRepo.findAll();
	}
	
	
	
	//delete

	public String deleteById(Integer id) {
		userRepo.deleteById(id);
		return "deleted";
	}
}
