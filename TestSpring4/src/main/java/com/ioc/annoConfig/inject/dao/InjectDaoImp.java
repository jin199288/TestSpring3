package com.ioc.annoConfig.inject.dao;

import org.springframework.stereotype.Repository;

@Repository("injectDao")
public class InjectDaoImp implements InjectDao {
	public void say() {
		System.out.println("invoke injectDao..");
	}

	public InjectDaoImp() {
		super();
		System.out.println("InjectDaoImp() invoke");
	}

}
