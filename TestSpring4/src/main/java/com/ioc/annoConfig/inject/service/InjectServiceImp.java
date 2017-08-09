package com.ioc.annoConfig.inject.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.ioc.annoConfig.inject.dao.InjectDao;

@Service
public class InjectServiceImp implements InjectService {
	
//	@Autowired()
//	@Qualifier("injectDao")
	@Resource()
	private InjectDao injectDao;	
	
	//@Autowired()
	public void setInjectDao(InjectDao injectDao) {
		this.injectDao = injectDao;
		System.out.println("setInjectDao()  invoke");
	}
	public InjectServiceImp() {	
		System.out.println("InjectServiceImp()  invoke");
	}
	//@Autowired()
	public InjectServiceImp(InjectDao injectDao) {
		super();
		this.injectDao = injectDao;
		System.out.println("InjectServiceImp(InjectDao injectDao)  invoke");
	}
	
	public void say() {
		injectDao.say();
	}

}
