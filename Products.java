package com.java8streams;

import java.util.ArrayList;
import java.util.List;

public class Products {
	
	int id;
	String name;
	float price;
	public Products(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public static void main(String[] args) {
		

		Products products1= new Products(1, "aaple", 250f);
		
		Products products2 = new Products(2, "bannana", 400f);
		
		
		List<Products> list = new ArrayList<Products>();
		
		list.add(products1);
		list.add( products2);
		
		    // or using dircect creat in object in list
		//list.add(new Products(1, "aaple", 250f));
		//list.add(new Products(2, "bannana", 400f));
		
		List<Float> ll = new ArrayList<Float>();
		
		for(Products m:list) {
			
			ll.add(m.getPrice());
		}

		for(Float f:ll) {
			System.out.println(f);
		}
	}

}
