package com.ioc.inject.dao;

public class InjectDaoImp implements IInjectDao {
	public void say() {
		System.out.println("invoke injectDao..");
	}

	public InjectDaoImp() {
		super();
		System.out.println("InjectDaoImp() invoke");
	}

}
