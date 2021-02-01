package com.cg.vm.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class DBUtil {
	private EntityManagerFactory entityManagerFactory = null;
	public EntityManager entityManager = null;
	
	/**
	 * creates a entityManager object
	 * @return entity manager
	 */
	public EntityManager createEntityManager()
	{
		 entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
		 entityManager = entityManagerFactory.createEntityManager();
		 return entityManager;
	}
	
	/**
	 * closes EntityManagerFactory and EntityManager Resources
	 */
	public void closeResources()
	{
		entityManagerFactory.close();
		entityManager.close();
	}
}