package com.cg.vm.service;

import com.cg.vm.bean.User;
import com.cg.vm.dao.IUserRepository;
import com.cg.vm.dao.IUserRepositoryImpl;


public class IUserServiceImpl implements IUserService {

	IUserRepository iUserRepository = new IUserRepositoryImpl();
	@Override
	public User validateUser(User user) {
		return iUserRepository.validateUser(user);
		
	}

	@Override
	public User addUser(User user) {
		User addedUser =iUserRepository.addUser(user);
		return addedUser;
	}

	@Override
	public User removeUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User signOut(User user) {
		IUserRepository logout = new IUserRepositoryImpl();
		return logout.signOut(user);
	}

}
