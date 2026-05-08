package com.rays.java.oop.polymorphism;
public class TestShapeArray {
	public static void main(String[] args) {
		 Shape[] s = new Shape[2];
		 System.out.println("length of index :"+s.length);
		 
		 s[0] = new Circle();
		 s[1] = new Triangle();
		 
		  Circle c = (Circle) s[0];
		  c.setRadius(2);
		  
		  Triangle t = (Triangle) s[1];
			t.setBase(4);
			t.setHight(4);
		  
			for(int i = 0 ; i<s.length;i++) {
				System.out.println(s[i].area());
			}
		  
		 
	}
	 
	 

}
