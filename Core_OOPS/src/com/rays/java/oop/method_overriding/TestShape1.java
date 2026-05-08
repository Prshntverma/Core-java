package com.rays.java.oop.method_overriding;

public class TestShape1 {

	public static void main(String[] args) {
		System.out.println("..............circle..............");
		 Circle c = new Circle();
		
		 c.setColor("red");
		 c.setBorderwidth(3);
	    c.setRadius(4);
	    
	    System.out.println("color of circle : "+c.getColor());
	    System.out.println("borderwidth of circle : "+c.getBorderwidth());
	    System.out.println("radius of circle :"+ c.getRadius());
	    System.out.println("area of circle :"+c.area());
	    
	    System.out.println("---------Rectangle-----------");
        Rectangle r = new Rectangle();
        
         r.setColor("black");
         r.setBorderwidth(4);
         r.setLength(4);
         r.setWidth(6);
         
         System.out.println("Rectangle color :"+r.getColor());
         System.out.println("borderwidth :"+r.getBorderwidth());
         System.out.println("length of rectangle :"+r.getLength());
         System.out.println("width of rechtangle :"+r.getWidth());
         System.out.println("area of rectangle :"+ r.area());
         
         System.out.println("............triangle..............");
         
         Triangle t = new Triangle();
     
           
         t.setColor(" Yellow ");
         t.setBorderwidth(3);
         t.setBase(5);
         t.setHight(9);
         
         System.out.println(t.getColor());
         System.out.println(t.getBorderwidth());
         System.out.println(t.getHight());
         System.out.println(t.getBase());
         System.out.println(t.area());
        
	}
	}
    

