package com.java8streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterMethod {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("dhane", "shyam", "ram","prasanna");
		
		Stream<String> stream1 =list.stream().filter(name ->name.length()>4);
		Stream<String> stream2 =list.stream().filter(name ->name.length()>4);

	stream1.forEach(System.out::println);
		
	System.out.println("------------------");
	
	
		stream2.forEach(item -> System.out.println(item));
	}

}
