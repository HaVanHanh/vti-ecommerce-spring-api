package com.vti.ecommerce.service;

import java.util.List;

import com.vti.ecommerce.entities.UsersEntity;

public interface UserServiceInterface {

	public List<UsersEntity> getAllUsers();

	public UsersEntity getUserByID(short id);
}
