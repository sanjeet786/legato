package com.javapapers.webservices.rest.jersey;

import javax.xml.bind.annotation.XmlRootElement;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Product {
	@JsonProperty("product-id")
	private String id;
	@JsonProperty("product-name")
	private String name;
	@JsonProperty("product-category")
	private String category;

	public Product() {

	}

	public Product(String id, String name, String category) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}