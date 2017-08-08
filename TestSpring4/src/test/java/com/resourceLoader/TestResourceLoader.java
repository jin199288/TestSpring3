package com.resourceLoader;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.base.UtilBaseTest;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestResourceLoader extends UtilBaseTest{

	public TestResourceLoader() {
		super("classpath:/spring/applicationContext-resourceLoader.xml");		
	}
	@Test
	public void testResource(){
		String path1 = "classpath:jdbc.properties";
		ResourceLoader resourceLoader = super.getBean("resourceLoader");
		resourceLoader.getResource(path1);
	}
}
