package com.bank;

import java.util.Random;

public class StockAccount extends RegularAccount {

	//****Field******
	Random random = new Random();
	int rand;
	int range=6;
	
	//****Constructor***********
	StockAccount(int clientId, double balance) {
		super(clientId, balance);
		this.commissionOnDeposit=0;
		this.commissionOnWithdrawal=0;
	}
	
	//***********Function***********
	public void deposit(double sum){
		double temp=0;
		 this.commissionOnDeposit = random.nextInt(range);
		 this.commissionOnWithdrawal = random.nextInt(range);
		 
		temp= sum + this.commissionOnDeposit + this.getBonus();
		super.deposit(temp);
		
	}
	
	 public void withdraw(double sum){
			double temp=0;
			
			 this.commissionOnDeposit = random.nextInt(range);
			 this.commissionOnWithdrawal = random.nextInt(range);
			
			temp= sum - this.commissionOnWithdrawal;
			super.withdraw(temp);
			
	   }
	 
	 protected double getBonus(){
		 
			 return  this.commissionOnDeposit - this.commissionOnWithdrawal;
		 
	 }
	
	

	
	

}
