package com.aop;

import org.springframework.stereotype.Component;

@Component
public class PointCutBean {
	public Object pointCut() {
		System.out.println("point cut invoke...");
		//throw new RuntimeException("exception");
		return "c3";
	}
}
