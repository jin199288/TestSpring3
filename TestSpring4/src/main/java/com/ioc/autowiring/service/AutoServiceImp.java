package com.ioc.autowiring.service;

import com.ioc.autowiring.dao.AutoDao;

public class AutoServiceImp implements AutoService {

	private AutoDao autoDao;
	
	/*public void setAutoDao(AutoDao autoDao) {
		this.autoDao = autoDao;
		System.out.println("setAutoDao invoke");
	}*/

	public AutoServiceImp() {
		super();
		System.out.println("AutoServiceImp() invoke");
	}

	public AutoServiceImp(AutoDao autoDao) {
		super();
		this.autoDao = autoDao;
		System.out.println("AutoServiceImp(AutoDao autoDao) invoke");
	}

	public void say() {
		autoDao.say();		
	}

}
