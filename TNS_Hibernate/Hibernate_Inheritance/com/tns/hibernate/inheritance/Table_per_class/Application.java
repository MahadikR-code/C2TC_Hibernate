package com.tns.hibernate.inheritance.Table_per_class;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

		Employee emp = new Employee();
		emp.setName("raven");
		ContractEmployee contEmp = new ContractEmployee();
		contEmp.setName("rohit");
		contEmp.setType("Contract");
		em.persist(contEmp);

		PermanentEmployee perEmp = new PermanentEmployee();
		perEmp.setName("ram");
		perEmp.setType("Permanent");
		em.persist(perEmp);

		em.getTransaction().commit();

		System.out.println("Added Contract and permanent employee to database.");
		em.close();
		factory.close();
	}

}
