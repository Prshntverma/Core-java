package com.java.collection.sorting;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestStudent {

	public static void main(String[] args) {
	  
		Student s1 = new Student(1,"Prashant",12);
		Student s2 = new Student(2,"rashant",11);
		Student s3 = new Student(3,"shant",10);
		Student s4 = new Student(4,"hant",9);
		Student s5 = new Student(5,"Prant",7);
		 
		
		 System.out.println("----------------------");
			ArrayList list = new ArrayList();
			list.add(s1);
			list.add(s2);
			list.add(s3);
			list.add(s4);
			list.add(s5);

			System.out.println(list);
			System.out.println(" --- --- --- --- --- --- --- ");

			for (Object o : list) {
				System.out.println(o);
			}
			System.out.println("----  -----  -  ------   ----");
			Iterator it = list.iterator();

			while (it.hasNext()) {
				Object o = it.next();
				System.out.println(o);
	}
}}
