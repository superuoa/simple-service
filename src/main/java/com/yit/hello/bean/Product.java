package com.yit.hello.bean;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Product {

	int id;
	String name;
	String description;
	int price;
	int instock;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getInstock() {
		return instock;
	}
	public void setInstock(int instock) {
		this.instock = instock;
	}
	
	public List<Product> getProducts(){
		
		List<Product> list = new ArrayList<Product>();
		
		Product p = new Product();
		p.setId(1);
		p.setDescription("โน๊ตบุคเดล");
		p.setInstock(1);
		p.setName("Notebook DELL");
		p.setInstock(10);
		
		Product p2 = new Product();
		p2.setId(2);
		p2.setDescription("Smart TV TU7000");
		p2.setName("SAMSUNG Crystal UHD 4K");
		p2.setInstock(5);
		
		Product p3 = new Product();
		p3.setId(3);
		p3.setDescription("14976 BTU, Inverter");
		p3.setName("HAIER Air Conditioning");
		p3.setInstock(2);
		
		list.add(p);
		list.add(p2);
		list.add(p3);
		
		return list;
		
	}
	
	public static List<Product> buildJsonToCallsObject(String json){

		Gson gson = new Gson();
		
		TypeToken<List<Product>> token = new TypeToken<List<Product>>() {};
		List<Product> cList = gson.fromJson(json, token.getType());
		
		
		return cList;
		
	}
	
	public static Product buildJsonToObject(String json){

		Gson gson = new Gson();

		Product c = gson.fromJson(json, Product.class);
		
		
		return c;
		
	}
	
}
