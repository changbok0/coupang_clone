package com.jjang051.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jjang051.model.ItemDao;
import com.jjang051.model.ItemDto;

@Controller
public class ItemsApiController {
	@Autowired
	ItemDao itemDao;
	
	@ResponseBody
	@RequestMapping("/Items.do")
	public Map<String,List<ItemDto>> jsonList() {
		Map<String,List<ItemDto>> hashMap = new HashMap<>();
		List<ItemDto> itemList = itemDao.getAllItemList();
		hashMap.put("itemList",itemList);
		return hashMap;
	}
}













