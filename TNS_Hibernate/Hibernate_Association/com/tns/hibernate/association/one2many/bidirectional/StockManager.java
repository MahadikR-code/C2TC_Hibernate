package com.tns.hibernate.association.one2many.bidirectional;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StockManager {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

		Category category = new Category("Computer");

		Product pc = new Product("DELL PC", "Quad-core PC", 1200, category);

		Product laptop = new Product("MacBook", "Apple High-end laptop", 2100, category);

		Product phone = new Product("iPhone 5", "Apple Best-selling smartphone", 499, category);

		Product tablet = new Product("iPad 3", "Apple Best-selling tablet", 1099, category);

		Set<Product> products = new HashSet<Product>();
		products.add(pc);
		products.add(laptop);
		products.add(phone);
		products.add(tablet);

		category.setProducts(products);
		em.persist(category);
		em.getTransaction().commit();

		System.out.println("Succesfully Performed One to Many mapping.");
		em.close();
		factory.close();
	}

}
