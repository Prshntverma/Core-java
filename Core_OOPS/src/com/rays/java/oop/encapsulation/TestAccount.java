package com.rays.java.oop.encapsulation;

public class TestAccount {

	public static void main(String[] args) {
		 
         Account a1 = new Account();
         a1.setAccNumber("123456789012");
         a1.setAccType("Saving");
         a1.setBalance(90000.00);
         
      
         
         System.out.println("Account number : "+ a1.getAccNumber());
         System.out.println("Account Type : "+ a1.getAccType());
         System.out.println("Account balance : "+ a1.getBalance());
         a1.deposit(4000.00);
         a1.withdrawal(899);
         System.out.println("..............................");
//         Account a2 = new Account();
//         
//         a2.setAccNumber("120987654321");
//         a2.setAccType("Saving");
//         a2.setBalance(70000.00);
//         
//      
//         
//         System.out.println("Account number : "+ a2.getAccNumber());
//         System.out.println("Account Type : "+ a2.getAccType());
//         System.out.println("Account balance : "+ a2.getBalance());
         
         
	}
}
