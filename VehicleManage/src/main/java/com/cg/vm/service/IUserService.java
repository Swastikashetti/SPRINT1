package com.cg.vm.service;
import com.cg.vm.bean.User;

public interface IUserService {

	public User validateUser(User user);
	public User addUser(User user);
	public User removeUser(User user);
	public User signOut(User user);
}
