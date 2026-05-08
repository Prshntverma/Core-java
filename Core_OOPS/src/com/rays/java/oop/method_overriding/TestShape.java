package com.rays.java.oop.method_overriding;

public class TestShape {

	public static void main(String[] args) {
		
		System.out.println("..............circle..............");
		 Shape s1 = new Circle();
		 Circle c = (Circle) s1;
		 c.setColor("red");
		 c.setBorderwidth(3);
         c.setRadius(4);
         
         System.out.println("color of circle : "+c.getColor());
         System.out.println("borderwidth of circle : "+c.getBorderwidth());
         System.out.println("radius of circle :"+ c.getRadius());
         System.out.println("area of circle :"+c.area());
         
         System.out.println("---------Rectangle-----------");
         Shape r1 = new Rectangle();
          Rectangle r = (Rectangle) r1;
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
          
          Shape t1 = new Triangle();
          Triangle t = (Triangle) t1;
            
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
