package com.turtle.springboot.controller;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class AnotherDemoController {
	@RequestMapping("/dfs")
	public String home() {
		return "dfs";
	}
	
}
