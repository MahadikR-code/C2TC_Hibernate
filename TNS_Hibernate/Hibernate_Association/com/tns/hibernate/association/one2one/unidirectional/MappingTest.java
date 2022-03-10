package com.tns.hibernate.association.one2one.unidirectional;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MappingTest {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

		Book book = new Book();
		book.setTitle("Hibernate Made Easy");
		book.setDescription("Simplified Data persistence with Hibernate and JPA");
		book.setPublishedDate(new Date());
		book.setAuthor(new Author("Cameron McKenzie", "Cameron@gmail.com"));
		em.persist(book);

		em.getTransaction().commit();

		System.out.println("Succesfully Performed One to One mapping.");
		em.close();
		factory.close();
	}
}
