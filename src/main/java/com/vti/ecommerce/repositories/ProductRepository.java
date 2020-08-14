package com.vti.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vti.ecommerce.entities.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Short>{

}
