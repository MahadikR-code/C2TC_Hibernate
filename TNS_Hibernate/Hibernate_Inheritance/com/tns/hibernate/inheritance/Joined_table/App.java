package com.tns.hibernate.inheritance.Joined_table;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

		Payment payment = new Payment();
		payment.setAmount(6000);

		Card card = new Card();
		card.setCardno(123456);
		card.setAmount(4500);
		card.setCard_Type("visa");
		em.persist(card);

		Cheque cheque = new Cheque();
		cheque.setAmount(10000);
		cheque.setChq_type("order");
		cheque.setChqno(605697);
		em.persist(cheque);

		em.getTransaction().commit();

		System.out.println("Added transaction to database.");
		em.close();
		factory.close();
	}
}
