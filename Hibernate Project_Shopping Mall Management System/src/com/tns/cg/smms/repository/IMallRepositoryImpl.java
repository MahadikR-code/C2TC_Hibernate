package com.tns.cg.smms.repository;

import javax.persistence.EntityManager;

import com.tns.cg.smms.entity.Mall;

public class IMallRepositoryImpl implements IMallRepository {
	private EntityManager entityManager;

	// starting JPA lifecycle
	public IMallRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	// implementation
	@Override
	public Mall addMall(Mall mall) {
		entityManager.persist(mall);
		return mall;
	}

	@Override
	public Mall updateMall(Mall mall) {
		entityManager.merge(mall);
		return mall;
	}

	@Override
	public Mall searchMall(int id) {
		Mall mall = entityManager.find(Mall.class, id);
		return mall;
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

	@Override
	public boolean cancelMall(int id) {

		return false;
	}

}
