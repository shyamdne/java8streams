package com.java8streams;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamExample {

	private static List<Produkt> Produktlist = new ArrayList<Produkt>();

	public static void main(String[] args) {
		// adding Produkt details

		Produktlist.add(new Produkt(1, "apple", 25000f));
		Produktlist.add(new Produkt(1, "Orange", 28000f));
		Produktlist.add(new Produkt(1, "bannana", 45000f));
		Produktlist.add(new Produkt(1, "guava", 15000f));
	Produktlist.add(new Produkt(1, "cherry", 9000f));

		withStreamApi();

	}

	private static void withStreamApi() {

		List<Float> ProduktPricelist = Produktlist.stream().filter((Produkt) -> Produkt.getPrice() > 25000)
	            .map((Produkt) -> Produkt.getPrice()).collect(Collectors.toList());
		
		//display using lambda 
		ProduktPricelist.forEach((price) -> System.out.println(price));

		System.out.println("--------------------------------------------------------");
		//using method interface get print  or
		
		ProduktPricelist.forEach(System.out::println);

	}
}


class Produkt {

	private int id;
	private String name;
	private float price;

	public Produkt(int id, String name, float price) {
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
