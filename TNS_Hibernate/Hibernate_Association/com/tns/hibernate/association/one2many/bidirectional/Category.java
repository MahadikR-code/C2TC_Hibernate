package com.tns.hibernate.association.one2many.bidirectional;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CATEGORY")
public class Category {

	private long id;
	private String name;

	private Set<Product> products;

	public Category() {
	}

	public Category(String name) {
		this.name = name;
	}

	@Id
	@Column(name = "CATEGORY_ID")
	@GeneratedValue
	public long getId() {
		return id;
	}

	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(long id) {
		this.id = id;
	}

}