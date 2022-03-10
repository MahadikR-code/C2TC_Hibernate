package com.tns.hibernate.association.many2many.unidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tns.hibernate.association.many2many.bidirectional.Student;
import com.tns.hibernate.association.many2many.bidirectional.Subject;

public class Test {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Student student1 = new Student("Sham", "Raje");
		Student student2 = new Student("Josh", "Hazzelwood");

		Subject subject1 = new Subject("Maths");
		Subject subject2 = new Subject("Science");
		Subject subject3 = new Subject("History");

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

		System.out.println("Succesfully Performed Many to Many Unidirectional mapping.");
		em.close();
		factory.close();
	}
}