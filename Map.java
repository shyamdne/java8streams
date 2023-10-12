package com.java8streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Map {
	
	
	public static void main(String[] args) {
		
		List<String> listofString = Arrays.asList("1", "2","3","4");
		
		List<Integer> listofInteger =listofString.stream()
				.map(Integer::valueOf)
				
				.collect(Collectors.toList());
		
		System.out.println(listofInteger);
		
		listofInteger.forEach(System.out::println);
		listofInteger.forEach(integer ->System.out.println(integer));
		for(Integer in: listofInteger) {
			System.out.println(in);
		
	}

}
}