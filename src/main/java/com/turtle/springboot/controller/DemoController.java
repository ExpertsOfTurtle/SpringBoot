package com.turtle.springboot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.turtle.springboot.bean.TurtleBean;

import net.sf.json.JSONObject;

@RestController
@EnableAutoConfiguration
public class DemoController {

	@Autowired
	private TurtleBean turtleBean;

	@RequestMapping("/")
	String home() {
		return "Hello " + turtleBean.getName();
	}

	@RequestMapping("/index")
	public String index(Model model) {

		model.addAttribute("name", "Ryan");
		
		return "index";
	}

	@RequestMapping("/json")
	@ResponseBody
	public Map<String, Object> json() {
		JSONObject json = new JSONObject();
		json.put("ww", "ttt");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "Ryan");
		map.put("age", "18");
		map.put("sex", "man");
//		return map;
		return json;
	}
}
