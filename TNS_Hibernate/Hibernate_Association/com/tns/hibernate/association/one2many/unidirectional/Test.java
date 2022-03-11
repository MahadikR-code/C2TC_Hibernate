package com.tns.hibernate.association.one2many.unidirectional;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

		Branch branch = new Branch();
		branch.setBranchShortName("CSE");
		branch.setBranchName("Computer Science and Engineering");
		branch.setDescription(
				"CSE department offers courses under ambitious curricula in computer science and computer engineering..");
		List students = new ArrayList();
		students.add(getStudent1());
		students.add(getStudent2());
		branch.setStudents(students);

		em.persist(branch);
		em.getTransaction().commit();

		System.out.println("successfull");
		em.close();
		factory.close();
	}

	private static Object getStudent1() {
		Student student = new Student();
		student.setFname("Peter");
		student.setLname("Milanovich");
		student.setContactNo("+1-408-575-1317");

		return student;
	}

	private static Object getStudent2() {
		Student student = new Student();
		student.setFname("Rosy");
		student.setLname("Larsen");
		student.setContactNo("+1-408-575-1219");

		return student;
	}
}
