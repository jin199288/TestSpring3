package com.ioc.inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.base.UtilBaseTest;
import com.ioc.xmlConfig.inject.service.IInjectService;
@RunWith(BlockJUnit4ClassRunner.class)
public class InjectTest extends UtilBaseTest{
	public InjectTest() {
		super("classpath:/spring/applicationContext.xml");		
	}
	@Test
	public void testInjectSetter(){
		IInjectService iInjectService = super.getBean("iInjectService");
		iInjectService.say();
	}
}
