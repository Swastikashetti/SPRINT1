package com.cg.vm.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import com.cg.vm.bean.Customer;
import com.cg.vm.bean.User;
import com.cg.vm.util.DBUtil;

public class IUserRepositoryImpl implements IUserRepository {
	DBUtil dbUtil = new DBUtil();
	/**
	 * create dbutil class object and create a entity manager from
	 * createEntityManager Function
	 */
	EntityManager entityManager = dbUtil.createEntityManager();

	@Override
	public User validateUser(User user) {

		String sql = "Select * from customer where userid=? and password =?";
		String id = user.getUserId();
		String pwd = user.getPassword();
		Query query = entityManager.createNativeQuery(sql, Customer.class);
		query.setParameter(1, id);
		query.setParameter(2, pwd);
		try {
			Customer result = (Customer) query.getSingleResult();
			return user;
		} catch (NoResultException r) {
			return null;
		}
	}

	@Override
	public User addUser(User user) {
		return null;
	}

	@Override
	public User removeUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User signOut(User user) {
		System.exit(0);
		return null;
	}

}
