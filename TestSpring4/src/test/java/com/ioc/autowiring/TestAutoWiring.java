package com.ioc.autowiring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.base.UtilBaseTest;
import com.ioc.autowiring.service.AutoService;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAutoWiring extends UtilBaseTest{

	public TestAutoWiring() {
		super("classpath:/spring/applicationContext-autowiring.xml");		
	}

	@Test
	public void testAuto(){
		AutoService autoService = super.getBean("autoService");
		autoService.say();
	}
}
