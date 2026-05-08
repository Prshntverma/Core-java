package com.rays.java.oop.encapsulation;
import java.util.Date;

public class TestPerson {

    public static void main(String[] args) {


        Person p1 = new Person();

     
        p1.setName("Prashant");
        p1.setAddress("Gwalior");
        Date dob = new Date(2000, 10, 25); 
        p1.setDob(dob);

      
        System.out.println("Name: " + p1.getName());
        System.out.println("Address: " + p1.getAddress());
        System.out.println("Date of Birth: " + p1.getdob());
    }
}