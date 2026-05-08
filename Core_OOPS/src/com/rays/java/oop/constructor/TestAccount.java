package com.rays.java.oop.constructor;

public class TestAccount {

	public static void main(String[] args) {
		Account a = new Account("12334566443", "saving..", 56000.00);

		System.out.println(a.getAccNo());
		System.out.println(a.getAccType());
		System.out.println(a.getBal());

	}

}
