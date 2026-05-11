package com.java.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSort {

	public static void main(String[] args) {
		 List list = new ArrayList();
	   
		 list.add(23);
		 list.add(5);
		 list.add(10);
		 list.add(13);
		 list.add(15);
		 list.add(27);
		 
		 System.out.println("print before sorting :"+ list);
		 Collections.sort(list);
		 
		 System.out.println("after the sorting :"+list);
		 
	}
}
