package com.jjang051.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CartController {
	
	@RequestMapping(value="/CartView.do", method=RequestMethod.GET)
	public String CartView() {
		return "cartView";
	} 
}
