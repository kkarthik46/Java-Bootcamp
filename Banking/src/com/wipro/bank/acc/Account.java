package com.wipro.bank.acc;

public abstract class Account {
	
	int tenure;
	float principal;
	float rateOfInterest;
	
	public void setInterest(int age, String gender){
		
	}
	
	public float calculateMaturityAmount(float totalPrincipleDeposited,float maturityInterest)
	{
		return maturityInterest;
		
	}
	
	public abstract float calculateInterest();
	public abstract float calculateAmountDeposited();



}
