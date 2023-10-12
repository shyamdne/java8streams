package com.java8streams;

import java.util.ArrayList;
import java.util.List;

public class WithOutStream {
	private static List<Product> Productlist = new ArrayList<Product>();



	public static void main(String[] args) {
		// adding product details

		Productlist.add(new Product(1, "apple", 25000f));
		Productlist.add(new Product(1, "Orange", 28000f));
		Productlist.add(new Product(1, "bannana", 45000f));
		Productlist.add(new Product(1, "guava", 15000f));
		Productlist.add(new Product(1, "cherry", 9000f));

		withoutStreamApi();

	}

	private static void withoutStreamApi() {

		List<Float> productPricelist = new ArrayList<Float>();

		for (Product product : Productlist) {
			
			if(product.getPrice()>25000f) {
				
				productPricelist.add(product.getPrice());
				
				
			}

		}
		//display data
		for(Float price:productPricelist) {
			
			System.out.println(price);
		}

	}

}

class Product {

	private int id;
	private String name;
	private float price;

	public Product(int id, String name, float price) {
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
	


}
