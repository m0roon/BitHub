package com.bank;

public class RegularAccount {

	//********Field*************
	
	private final int clientId;
	private double bonus;
	private double balance;
	protected  int commissionOnWithdrawal = 3 ; // commission on withdrawals -
	protected  int commissionOnDeposit = 1 ; // commission on deposits +
	protected  int depositCounter=0;
	protected  int withdrawalCounter=0;
	
	//******GETs & SEts**********
	
	public int getClientId(){
		return this.clientId;
	}
	
	public double getBalance(){
		return this.balance;
	}
	
	public int getDepositCounter(){
		return this.depositCounter;
	}
	
	public int getWithdawalCounter(){
		return this.withdrawalCounter;
	}
	
//**********Constructor***********
	
	RegularAccount(int clientId , double balance ){
		this.clientId=clientId;
		this.balance=balance;
		this.bonus=0;
	}

	
//*************Methods**********
   public void deposit (double sum){
	   this.balance = this.balance + this.commissionOnDeposit+ this.bonus; 
	   this.depositCounter++;   
   }
   
   public void withdraw(double sum){
	   this.balance = this.balance + sum - this.commissionOnWithdrawal;
   }
   
   protected double getBonus(){ 
	   return 0;
   }
   
	
}
