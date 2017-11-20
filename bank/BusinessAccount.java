package com.bank;

public class BusinessAccount extends RegularAccount {

	BusinessAccount(int clientId, double balance) {
		
		super(clientId, balance);
		this.commissionOnDeposit=1;
		this.commissionOnWithdrawal=1;
		
	}
		
	public void deposit(double sum){
		double temp=0;
		if(this.depositCounter > 7)
			this.depositCounter=0;
		
		temp= sum + this.commissionOnDeposit + this.getBonus();
		super.deposit(temp);
		this.depositCounter ++;
	}
	
	 public void withdraw(double sum){
			double temp=0;
			
			temp= sum - this.commissionOnWithdrawal;
			super.withdraw(temp);
			
	   }
	 
	 protected double getBonus(){
		 if(this.depositCounter ==7)
			 return 20.0 * this.commissionOnDeposit;
		 return 0;
	 }
  
} 
	
	
	




