package com.products.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;
/**
 * 
 * @author sangeetha
 *
 */
@Entity
@Table(name = "product")
public class Product {

	@ApiModelProperty(notes = "Product ID",name="id",required=true,value="122")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@ApiModelProperty(notes = "Name of the Product",name="item",required=true,value="Electronics")
	@Column(name = "item")
	private String item;

	@ApiModelProperty(notes = "Product description",name="description",required=true,value="Electronics")
	@Column(name = "description")
	private String description;

	@ApiModelProperty(notes = "Price of the product",name="product",required=true,value="22423.00")
	@Column(name = "price")
	private double price;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
