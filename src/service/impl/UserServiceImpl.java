package service.impl;

import service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public void addUser() {
		System.out.println("添加用户");
	}

	@Override
	public void delUser() {
		System.out.println("删除用户");
	}

}
