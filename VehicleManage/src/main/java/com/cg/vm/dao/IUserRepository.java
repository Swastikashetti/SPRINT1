package com.cg.vm.dao;
import com.cg.vm.bean.User;

public interface IUserRepository {

	public User validateUser(User user);
	public User addUser(User user);
	public User removeUser(User user);
	public User signOut(User user);
}
