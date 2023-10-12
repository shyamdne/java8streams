package com.java8streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamTest {
	public static void main(String[] args) {
		// Creating stream using collection and println java 8 method reference(System.out::println)

		Collection<String> collection = Arrays.asList("shyam", "ram", "chinni", "adhya", "pottodu");
		Stream<String> stream2 = collection.stream();
		stream2.forEach(System.out::println);

		// using list
		List<String> list = Arrays.asList("Nagapoor", "kammarpally", "Nizamabad", "Telangana");
		Stream<String> stream3 = list.stream();
		stream3.forEach(System.out::println);
		
		//using set		
		Set<String> set = new HashSet<>(list);
		Stream<String> stream4 = set.stream();
		stream4.forEach(System.out::println);

	}
}