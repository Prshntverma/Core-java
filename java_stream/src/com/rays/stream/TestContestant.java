package com.rays.stream;

import java.util.ArrayList;

public class TestContestant {
	public static void main(String[] args) {
		 
		ArrayList<Contestant> list = new ArrayList<Contestant>();
		
		list.add(new Contestant("Ram", "7875896985"));  //directly calling constructor 
		list.add(new Contestant("Shyam", "6985878589"));
		list.add(new Contestant("Ajay", "6985878589"));
		list.add(new Contestant("Vijay", "7875896985"));
		list.add(new Contestant("Jay", "7875836985"));
		list.add(new Contestant("Pappu", "6585898587"));
		list.add(new Contestant("invalidNo", "78858"));
		
		list.stream().map(e -> e.Phone_no).forEach(System.out::println);
		
		System.out.println("---------------------------------------");
		list.stream().map(e -> e.name).forEach(System.out::println);
		
		System.out.println("---------------------------------------");
		//get valid phone number....................
		
		list.stream().map(e->e.Phone_no)
					 .filter(e->e.length()==10)
					 .forEach(System.out::println);
		
		System.out.println("---------------------------------------------");
		//remove duplicate number
		list.stream().map(e->e.Phone_no)
		             .filter(e->e.length()==10)
		             .distinct()
		             .forEach(System.out::println);
		System.out.println("--------------------------------------------");
		// shuffle phoneNo
		list.stream().map(e -> e.phoneNo)
					 .filter(e -> e.length() == 10)
					 .distinct()
					 
		
		
		
		
	}

}
