package com.yit.hello.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yit.hello.bean.Product;

@RestController
public class WelcomeController {

	@RequestMapping( value = "/", method = RequestMethod.GET)
	public String hello() {
		return "Hello Simple Services";
	}
	
	@RequestMapping( value = "/getProducts", method = RequestMethod.GET)
	public List<Product> welcome(Map<String, Object> model) {
		Product product = new Product();
		
		List<Product> list = product.getProducts();
		
		return list;
	}
	
	@RequestMapping( value = "/getProduct/{id}", method = RequestMethod.GET)
    public Product getById(@PathVariable int id) {
		Product product = new Product();
		
		List<Product> list = product.getProducts();
		
		Product p = list.get(id-1);
		
		return p;
	}
}
