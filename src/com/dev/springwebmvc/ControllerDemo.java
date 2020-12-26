package com.dev.springwebmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerDemo {
	@RequestMapping("/link1")
	public String m1(){
		return "res1.jsp";
		
	}
	@RequestMapping("/link2")
	public String m2(){
		return "res2.jsp";
		
	}
	@RequestMapping("/link3")
	public String m3(){
		return "res3.jsp";
		
	}
}
