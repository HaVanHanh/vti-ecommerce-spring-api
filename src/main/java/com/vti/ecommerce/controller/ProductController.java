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

import com.vti.ecommerce.entities.ProductEntity;
import com.vti.ecommerce.service.ProductServiceInterface;

@CrossOrigin
@RestController
@RequestMapping(value = "api/v1/products")
public class ProductController {

	
	@Autowired
	private ProductServiceInterface service;

	@GetMapping()
	public ResponseEntity<?> getAllProducts() {
		List<ProductEntity> entities = service.getAllProducts();
		return new ResponseEntity<List<ProductEntity>>(entities, HttpStatus.OK);
	}

	@GetMapping(value = "getProductByID/{id}")
	public ResponseEntity<?> getProductByID(@PathVariable(name = "id") short id) {
		return new ResponseEntity<ProductEntity>(service.getProductByID(id), HttpStatus.OK);
	}
}
