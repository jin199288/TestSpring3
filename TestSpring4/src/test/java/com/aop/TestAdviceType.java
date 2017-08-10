package com.aop;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.base.UtilBaseTest;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAdviceType extends UtilBaseTest{

	public TestAdviceType() {
		super("classpath:/spring/applicationContext.xml");
	}

	@Test
	public void testAdviceType(){
		PointCutBean  pointCutBean = super.getBean("pointCutBean");
		pointCutBean.pointCut();
	}
	
	
}
