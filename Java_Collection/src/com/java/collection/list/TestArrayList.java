package com.java.collection.list;

import java.util.ArrayList;
import java.util.List;
public class TestArrayList { // searching fast hoti hai ...........
 
	public static void main(String[] args) {
	  
	   List list = new ArrayList();
	   
	   list.add(0,"Ram");
	   list.add(1,"am");
	   list.add(2,"m");
	   list.add(3,"am");
	   list.add(4,"Ra");
	   list.add(5,"R");
	   //list.add(null);
	   //list.add(null);
	  
	   System.out.println(list.indexOf("am")); // searching element from 0 index
	   System.out.println(list.lastIndexOf("Ram")); // searching element from last index
	   
	   
	   System.out.println(list.subList(0,4));
	   
	   System.out.println("------------------------------");
	   
	   System.out.println("list : "+ list);
	   
	   System.out.println(list.get(2)); // m 
	   
	   System.out.println(list.set(2,34));
	   
	   System.out.println("updated list :"+list);
	   
	   
	   
	   
	   
	   
	   
}
}