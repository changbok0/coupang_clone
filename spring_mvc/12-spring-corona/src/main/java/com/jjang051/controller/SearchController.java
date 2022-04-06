package com.jjang051.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jjang051.model.ItemDto;
import com.jjang051.model.SearchService;

@Controller
public class SearchController {
	
	@RequestMapping(value="/SearchPage.do", method=RequestMethod.GET)
	public String SearchPage() {
		return "searchPage";
	} 
}
