package com.turtle.springboot.bean;

import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;

@Component
public class TurtleBean {
	@Value("${name}")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
