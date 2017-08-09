package com.ioc.annoConfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.base.UtilBaseTest;
import com.ioc.annoConfig.inject.service.InjectServiceImp;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAnnoConfig extends UtilBaseTest{

	public TestAnnoConfig() {
		super("classpath:/spring/applicationContext.xml");		
	}

	@Test
	public void testAnno(){
		InjectServiceImp injectService = super.getBean("injectServiceImp");
		injectService.say();
	}
}
