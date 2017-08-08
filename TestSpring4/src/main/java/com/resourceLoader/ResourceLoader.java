package com.resourceLoader;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

public class ResourceLoader implements ApplicationContextAware{
	private ApplicationContext context;
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
	}

	public void getResource(String path){
		Resource resource = context.getResource(path);
		try {
			long contentLength = resource.contentLength();
			String filename = resource.getFilename();
			InputStream in = resource.getInputStream();
			Properties pro = new Properties();
			pro.load(in);
			String username = pro.getProperty("jdbc.username");
			String password = pro.getProperty("jdbc.password");
			System.out.println("contentLength:"+contentLength);
			System.out.println("filename:"+filename);
			System.out.println("username:"+username);
			System.out.println("password:"+password);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

