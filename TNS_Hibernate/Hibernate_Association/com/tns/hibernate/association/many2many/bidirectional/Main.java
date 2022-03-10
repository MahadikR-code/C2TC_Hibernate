package com.tns.hibernate.association.many2many.bidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Student student1 = new Student("Sam", "Billings");
		Student student2 = new Student("Virat", "Kohli");

		Subject subject1 = new Subject("Economics");
		Subject subject2 = new Subject("Politics");
		Subject subject3 = new Subject("Foreign Affairs");

		// Student1 have 3 subjects
		student1.getSubjects().add(subject1);
		student1.getSubjects().add(subject2);
		student1.getSubjects().add(subject3);

		// Student2 have 2 subjects
		student2.getSubjects().add(subject1);
		student2.getSubjects().add(subject2);

		em.persist(student1);
		em.persist(student2);

		em.getTransaction().commit();

		System.out.println("Succesfully Performed Many to Many Bidirectional mapping.");
		em.close();
		factory.close();
	}

}
