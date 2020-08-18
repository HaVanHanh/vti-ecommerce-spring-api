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

import com.vti.ecommerce.entities.CategoryEntity;
import com.vti.ecommerce.service.CategoryServiceInterface;

@CrossOrigin
@RestController
@RequestMapping(value = "/categories")
public class CategoryController {
	@Autowired
	private CategoryServiceInterface service;

	@GetMapping()
	public ResponseEntity<?> getAllCategories() {
		List<CategoryEntity> entities = service.getAllCategories();
		return new ResponseEntity<List<CategoryEntity>>(entities, HttpStatus.OK);
	}

	@GetMapping(value = "getCategoryByID/{id}")
	public ResponseEntity<?> getCategoryByID(@PathVariable(name = "id") short id) {
		return new ResponseEntity<CategoryEntity>(service.getCategoryByID(id), HttpStatus.OK);
	}
}
