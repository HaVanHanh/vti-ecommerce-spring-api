package com.vti.ecommerce.service;

import java.util.List;

import com.vti.ecommerce.entities.CategoryEntity;


public interface CategoryServiceInterface {

	List<CategoryEntity> getAllCategories();

	CategoryEntity getCategoryByID(short id);

}
