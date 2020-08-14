package com.vti.ecommerce.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "products", catalog = "express_typeorm_database")
public class ProductEntity {

	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	private Short id;

	@Column(name = "name", length = 100, nullable = false)
	private String name;

	@Column(name = "description", length = 100, nullable = true)
	private String description;

	@Column(name = "short_description", length = 100, nullable = true)
	private String short_description;

	@Column(name = "image", length = 2083, nullable = true)
	private String image;

	@Column(name = "status", length = 100, nullable = true)
	private short status;

	@Column(name = "sku", length = 1000, nullable = true)
	private String sku;
	
//	@Column(name = "category", length = 1000, nullable = true)
//	private Category category;
	
	@ManyToOne
//   @JoinColumn(name = "id",insertable = false, updatable = false)
	@JoinColumn(name="id_category", referencedColumnName="id",insertable = false, updatable = false)
    private Category category;
	
	@Column(name = "list_price", length = 1000, nullable = true)
	private int list_price;

	@Column(name = "sell_price", length = 1000, nullable = true)
	private int sell_price;

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

	public String getShort_description() {
		return short_description;
	}

	public void setShort_description(String short_description) {
		this.short_description = short_description;
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

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public int getList_price() {
		return list_price;
	}

	public void setList_price(int list_price) {
		this.list_price = list_price;
	}

	public int getSell_price() {
		return sell_price;
	}

	public void setSell_price(int sell_price) {
		this.sell_price = sell_price;
	}
			

	

}
