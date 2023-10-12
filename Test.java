package com.java8streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {
private static List<Employee> employeelist = new ArrayList<Employee>();		

	public static void main(String[] args) {
		
		
employeelist.add(new Employee(123, "shyam", 998514296));
employeelist.add(new Employee(222, "ram", 630150064));
employeelist.add(new Employee(333, "chinni",630140422));
employeelist.add(new Employee(444, "pottodu", 888999666));

employeenames();
employeeid();
employeemobile();
}
	private static void employeenames() {

		List<String> enames = new ArrayList<>();
		
	
		for(Employee name1:employeelist) {
			
			enames.add(name1.getName());
		}
	
		
		for (String s:enames ) {
			System.out.println(s);

	}
		System.out.println("---------------------------------");
	
}
	private static void employeeid() {

		List<Integer> eid = new ArrayList<Integer>();
		for(Employee idd:employeelist) {
			
			eid.add(idd.getId());
		}
	
		
		for (Integer i :  eid) {
			System.out.println(i);
	}
		System.out.println("---------------------------------");

}
	private static void employeemobile() {

		List<Long> emobile = new ArrayList<Long>();
		for(Employee imobile:employeelist) {
			
			emobile.add(imobile.getMobile());
		}
	
		
		for (Long m :  emobile) {
			System.out.println(m);
	}
	
}
	
}
