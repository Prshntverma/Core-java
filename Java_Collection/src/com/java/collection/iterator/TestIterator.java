package com.java.collection.iterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
    
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("ram");
		list.add("am");
		list.add("m");
		list.add("ra");
		list.add("r");
		list.add("ram!");
		
		System.out.println( " list " +list);
		
		System.out.println("---------------------------");
		Iterator<String> it = list.iterator();
		
		//list.add("grabs"); //ConcurrentModificationException == fail fast
		while(it.hasNext()) {
			//it.remove();  // java.lang.IllegalStateException
			Object o = it.next();
			System.out.println(o);
			it.remove();
		}
		System.out.println("---------------------------");
		System.out.println("list :"+list);
	}
}
