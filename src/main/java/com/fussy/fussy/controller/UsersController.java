package com.fussy.fussy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fussy.fussy.model.UsersModel;
import com.fussy.fussy.service.UsersService;

@RestController
@RequestMapping("/api")
public class UsersController {
	@Autowired
	UsersService userService;

	@RequestMapping(value="/employees", method=RequestMethod.POST)
	public UsersModel createUser(@RequestBody UsersModel user) {
		return userService.createUser(user);
	}


}
