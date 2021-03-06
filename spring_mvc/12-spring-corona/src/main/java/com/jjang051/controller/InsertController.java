package com.jjang051.controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jjang051.model.ItemDao;
import com.jjang051.model.ItemDto;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

@Controller
public class InsertController {
	@Autowired
	ItemDao itemDao;
	
	@RequestMapping(value="/Insert.do", method=RequestMethod.GET)
	public String insert() throws FileNotFoundException, IOException, CsvValidationException {
		  try (CSVReader reader = new CSVReader(new FileReader("C:\\Users\\leechangbok\\Documents\\Coupang-Clone\\items.csv"))) {
		      String[] lineInArray;
		      reader.readNext();
		      while ((lineInArray = reader.readNext()) != null) {
		    	  ItemDto itemDto = new ItemDto();
		    	  itemDto.setImgUrl("/12-spring-corona/"+lineInArray[1]);
		    	  itemDto.setTitle(lineInArray[2]);
		    	  itemDto.setPrice(lineInArray[3]);
		    	  itemDto.setShipping(lineInArray[4]);
		    	  itemDto.setRating(lineInArray[5]);
		    	  itemDto.setImgDetailUrl("/12-spring-corona/"+lineInArray[6]);

		    	  int result = itemDao.insertItem(itemDto);
		    	  
		    	  
		    	  System.out.println("======================");
		    	  System.out.println("insert result = "+result);
		          for (String string : lineInArray) {
					System.out.println(string);
				}
		      }
		  }
		return "insert";
	}
}
