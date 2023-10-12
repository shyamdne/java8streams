package com.java8streams;
//Creating Stream object from Arrays

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamCreationExample2 {
	public static void main(String[] args) {
		// Array can also be be source of Stream
		Stream<String> streamOfArray = Stream.of("Shyam", "dhane", "Adhya");
		streamOfArray.forEach(System.out::println);

		System.out.println("----------------------------------------------------------");
		// creating from existing array
		String[] arr = new String[] { "ram", "prasanna", "vishnu" };
		Stream<String> streamOfArrayFull = Arrays.stream(arr);
		streamOfArrayFull.forEach(System.out::println);

		System.out.println("----------------------------------------------------------");
		// creating part of a part of an array
		Stream<String> streamOfPart = Arrays.stream(arr, 1, 3);
		streamOfPart.forEach(System.out::println);

	}

}
