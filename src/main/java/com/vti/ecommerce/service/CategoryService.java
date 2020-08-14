package com.vti.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vti.ecommerce.entities.CategoryEntity;
import com.vti.ecommerce.repositories.CategoryRepository;

@Service
public class CategoryService implements CategoryServiceInterface {

	@Autowired
	CategoryRepository repository;

	@Override
	public List<CategoryEntity> getAllCategories() {

		return repository.findAll();
	}

	@Override
	public CategoryEntity getCategoryByID(short id) {

		return repository.findById(id).get();
	}

}
