package com.vti.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vti.ecommerce.entities.UsersEntity;
import com.vti.ecommerce.repositories.UserRepository;

@Service
public class UserService implements UserServiceInterface {

	@Autowired
	UserRepository repository;

	@Override
	public List<UsersEntity> getAllUsers() {
		return repository.findAll();
	}

	@Override
	public UsersEntity getUserByID(short id) {
		return repository.findById(id).get();
	}

}
