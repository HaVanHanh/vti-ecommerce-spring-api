package com.vti.ecommerce.repositories;

import org.springframework.data.repository.CrudRepository;

import com.vti.ecommerce.entities.Role;

public interface RoleRepository extends CrudRepository<Role, Integer> {

    Role findByName(String name);

}

