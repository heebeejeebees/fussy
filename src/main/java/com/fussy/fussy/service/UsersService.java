package com.fussy.fussy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fussy.fussy.model.UsersModel;
import com.fussy.fussy.repository.UsersRepository;

import java.util.UUID;
import java.util.List;

@Service
public class UsersService {

	@Autowired
	UsersRepository userRepository;   
	// CREATE 
	public UsersModel createUser(UsersModel user) {
		return userRepository.save(user);
	}

	// READ
	public List<UsersModel> getUsers() {
		return userRepository.findAll();
	}

	// DELETE
	public void deleteUser(UUID id) {
		userRepository.deleteById(id);
	}

	// UPDATE
	public UsersModel updateUser(UUID id, UsersModel userDetails) {
		UsersModel user = userRepository.findById(id).get();
		user.setRole(userDetails.getRole());
		user.setEmail(userDetails.getEmail());

		return userRepository.save(user);                                
	}
}