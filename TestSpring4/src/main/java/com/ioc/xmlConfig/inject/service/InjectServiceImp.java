package com.ioc.xmlConfig.inject.service;

import com.ioc.xmlConfig.inject.dao.IInjectDao;

public class InjectServiceImp implements IInjectService {
	private IInjectDao iInjectDao;	
	public void setiInjectDao(IInjectDao iInjectDao) {
		this.iInjectDao = iInjectDao;
		System.out.println("InjectServiceImp set invoke");
	}
	
	public InjectServiceImp() {	
		System.out.println("InjectServiceImp()  invoke");
	}
	public InjectServiceImp(IInjectDao iInjectDao) {
		super();
		this.iInjectDao = iInjectDao;
		System.out.println("InjectServiceImp(IInjectDao iInjectDao)  invoke");
	}
	
	public void say() {
		iInjectDao.say();
	}

}
