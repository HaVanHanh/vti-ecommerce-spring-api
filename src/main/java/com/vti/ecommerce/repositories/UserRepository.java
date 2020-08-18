package com.vti.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vti.ecommerce.entities.UsersEntity;

public interface UserRepository extends JpaRepository<UsersEntity, Short> {
	UsersEntity findByEmail(String email);
	UsersEntity findByPassword(String password);
}
