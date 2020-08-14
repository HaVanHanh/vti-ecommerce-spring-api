package com.vti.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categories", catalog = "express_typeorm_database")
public class Category {
	
	@Id
	@Column(name = "id", nullable = false)
	private Short id;

	public Short getId() {
		return id;
	}

	public void setId(Short id) {
		this.id = id;
	}
	
	
}
