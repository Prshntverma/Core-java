package com.rays.java.oop.abstraction;

public class TestShape {
 
	 public static void main(String[] args) {

	   //Shape s = new Shape(); // x can't create abstract class instance/object
		Shape s1 = new Circle();// uh can create object by child reference
	    Circle c = (Circle) s1;
	    c.setRadi(5);
	    System.out.println(c.area());
		    
	}
   
}
