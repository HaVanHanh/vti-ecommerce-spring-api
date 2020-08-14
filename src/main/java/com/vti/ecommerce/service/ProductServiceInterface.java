package com.vti.ecommerce.service;

import java.util.List;

import com.vti.ecommerce.entities.ProductEntity;

public interface ProductServiceInterface {

	List<ProductEntity> getAllProducts();

	ProductEntity getProductByID(short id);

}
