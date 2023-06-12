package com.yit.hello.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yit.hello.bean.Product;

@RestController
public class WelcomeController {

	@RequestMapping( value = "/", method = RequestMethod.GET)
	public String hello() {
		return "Hello Simple Services 2";
	}
	
	@RequestMapping( value = "/getProducts", method = RequestMethod.GET)
	public String welcome() {

		return "[{\"id\":1,\"name\":\"Notebook DELL\",\"description\":\"โน๊ตบุคเดล\",\"price\":0,\"instock\":10},{\"id\":2,\"name\":\"SAMSUNG Crystal UHD 4K\",\"description\":\"Smart TV TU7000\",\"price\":0,\"instock\":5},{\"id\":3,\"name\":\"HAIER Air Conditioning\",\"description\":\"14976 BTU, Inverter\",\"price\":0,\"instock\":2}]";
		
	}
	
	@RequestMapping( value = "/getProduct/{id}", method = RequestMethod.GET)
    public String getById(@PathVariable int id) {
		return "{\"id\":1,\"name\":\"Notebook DELL\",\"description\":\"RAM: 4, CPU: Intel Core i7-10750H\",\"price\":0,\"instock\":10}";
				
	}
	
	@RequestMapping( value = "/save", method = RequestMethod.POST)
    public String save(@RequestBody String data) {
		
		return "Save " + data + " Complete.";
				
	}
	
	
}
