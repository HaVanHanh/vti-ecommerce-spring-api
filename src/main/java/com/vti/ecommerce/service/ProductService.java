package com.vti.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vti.ecommerce.entities.ProductEntity;
import com.vti.ecommerce.repositories.ProductRepository;

@Service
public class ProductService implements ProductServiceInterface {

	@Autowired
	ProductRepository repository;
	
	@Override
	public List<ProductEntity> getAllProducts() {
		return repository.findAll();
	}

	@Override
	public ProductEntity getProductByID(short id) {
		
		return repository.findById(id).get();
	}

}
