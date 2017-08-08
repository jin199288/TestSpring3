package com.ioc.beanLifeCycle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.base.UtilBaseTest;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestLifeCycle extends UtilBaseTest {

	public TestLifeCycle() {
		super("classpath:/spring/applicationContext-lifeCycle.xml");		
	}

	@Test
	public void testLife(){
		//super.getBean("beanLifeCycle");
	}	
}
