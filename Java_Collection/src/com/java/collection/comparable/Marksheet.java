package com.java.collection.comparable;

public class Marksheet implements Comparable<Marksheet> {
  
	  private int rollNo; 
	  private String name;
	  private int phy;
	  
	  public Marksheet(int rollNo, String name,int phy) {
		this.rollNo= rollNo;
		this.name=name;
		this.phy=phy;
	}
	@Override
	public int compareTo(Marksheet o) {
		
		//return o.rollNo - this.rollNo; // Descending order
		return this.rollNo - o.rollNo;
	}
	@Override
	public String toString() {
		
		return " RollNo: "+ rollNo + " Name: "+ name + " phy: " + phy;
	}

}
