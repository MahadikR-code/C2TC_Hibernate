package com.tns.hibernate.association.one2one.bidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

		Person person = new Person();
		person.setName("Deepak");
		Address address = new Address();
		address.setState("gandhi road");
		address.setCity("CHIPLUN");
		address.setState("Maharashtra");
		address.setZipcode("415605");

		person.setAddress(address);

		em.persist(person);
		em.getTransaction().commit();

		System.out.println("successfull");
		em.close();
		factory.close();
	}
}
