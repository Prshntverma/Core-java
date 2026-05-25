package com.rays.io.serialization;

import java.io.Serializable;

public class Account implements Serializable {
	public String accountNo;
	public double bal;
	
	public Account(String a , double b) {
      this.accountNo = a;
      this.bal=b;
	}
	
	@Override
	public String toString() {
		
		return "Accountno :"+ accountNo + ", balance :"+bal;
	}

	
	

}
