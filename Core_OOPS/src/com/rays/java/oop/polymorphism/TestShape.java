package com.rays.java.oop.polymorphism;

public class TestShape {

    public static void main(String[] args) {

        // Polymorphism (Parent reference, child object)
        Shape s1 = new Circle();
        Shape s2 = new Triangle();

        // Downcasting to set specific properties
        ((Circle) s1).setRadius(5);
        s1.setColor("Red");
        s1.setBorderwidth(2);

        ((Triangle) s2).setBase(10);
        ((Triangle) s2).setHight(6);
        s2.setColor("Blue");
        s2.setBorderwidth(3);

        // Output
        System.out.println("Circle:");
        System.out.println("Color: " + s1.getColor());
        System.out.println("Border Width: " + s1.getBorderwidth());
        System.out.println("Area: " + s1.area());

        System.out.println("\nTriangle:");
        System.out.println("Color: " + s2.getColor());
        System.out.println("Border Width: " + s2.getBorderwidth());
        System.out.println("Area: " + s2.area());
    }
}