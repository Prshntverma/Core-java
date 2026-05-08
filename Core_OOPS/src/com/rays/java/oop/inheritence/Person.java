package com.rays.java.oop.inheritence;
import java.time.LocalDate;

public class Person {
	
   protected String name;
   protected String address;
   protected LocalDate dob;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public LocalDate getDob() {
	return dob;
}
public void setDob(LocalDate date) {
	this.dob = date;
}
   
	

}
