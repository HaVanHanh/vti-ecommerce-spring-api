package com.vti.ecommerce.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "categories", catalog = "express_typeorm_database")
public class CategoryEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	private Short id;
	
	
	@Column(name = "name", length = 100, nullable = false)
	private String name;

	@Column(name = "description", length = 100, nullable = true)
	private String description;

	
	@Column(name = "image", length = 2083, nullable = true)
	private String image;
	
	
	@Column(name = "status", length = 100, nullable = true)
	private short status;
	
	@Column(name = "avatar", length = 1000, nullable = true)
	private String avatar;
	
	@ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id",insertable = false, updatable = false)
    private Category parent;

//    @OneToMany(mappedBy = "categories", cascade = CascadeType.ALL)
//    private Set<Category> subCategory;

	public Short getId() {
		return id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public short getStatus() {
		return status;
	}

	public void setStatus(short status) {
		this.status = status;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public  Category getParent() {
		return parent;
	}

	public void setParent(Category parent) {
		this.parent = parent;
	}
	

	

}
