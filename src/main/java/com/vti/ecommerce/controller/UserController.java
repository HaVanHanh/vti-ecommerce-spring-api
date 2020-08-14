package com.vti.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vti.ecommerce.entities.UsersEntity;
import com.vti.ecommerce.service.UserService;

@CrossOrigin
@RestController
@RequestMapping(value = "api/v1/users")

public class UserController {

	@Autowired
    private UserService service;
	
	@GetMapping()
	public ResponseEntity<?> getAllDepartments() {
		List<UsersEntity> entities = service.getAllUsers();
		return new ResponseEntity<List<UsersEntity>>(entities, HttpStatus.OK);
	}

	@GetMapping(value = "getUserByID/{id}")
	public ResponseEntity<?> getUserByID(@PathVariable(name = "id") short id) {
		return new ResponseEntity<UsersEntity>(service.getUserByID(id), HttpStatus.OK);
	}

}
