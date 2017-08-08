package com.ioc.scope;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.base.UtilBaseTest;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestScope extends UtilBaseTest {
	public TestScope() {
		super("classpath:/spring/applicationContext-scope.xml");		
	}
	@Test
	public void testSingle(){
		ScopeBean scopeBean = super.getBean("scopeBean");
		scopeBean.say();
		ScopeBean scopeBean1 = super.getBean("scopeBean");
		scopeBean1.say();
	}
	
}
