package com.wipro.bank;

public class BankValidationException extends Exception {
	BankValidationException(String str)
	{
		super(str);
	}
	
	public String toString(){
		return "Invalid Data";
		
	}

}
