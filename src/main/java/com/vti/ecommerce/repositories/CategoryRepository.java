package com.vti.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vti.ecommerce.entities.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Short> {

}
