package com.ioc.xmlConfig.lifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycle implements InitializingBean,DisposableBean {

	public void init(){
		System.out.println("init invoke");
	}
	public void clean(){
		System.out.println("clean invoke");
	}
	public void destroy(){
		System.out.println("destroy invoke");
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet invoke");
		
	}
}
