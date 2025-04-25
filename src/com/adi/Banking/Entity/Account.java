package com.adi.Banking.Entity;

import com.adi.Banking.Exception.InsufficentFundException;

public abstract class Account {
	int accId;
	protected double accBalance;

	protected static double limit = 10000 ;
	
	public Account(int accId, double accBalance) {
		super();
		this.accId = accId;
		this.accBalance = accBalance;
	}


	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public double getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}

	@Override
	public String toString(){
		return "The Account ID is "+ accId + " and balance is "+ accBalance;
	}

	public abstract void creditMoney(double moneyToCredited);
	
	public abstract void debitMoney(double moneyToDebited) throws InsufficentFundException;

//	public abstract void transferMoney(double moneyToTransfer,SavingAccount otherAcc);
//	public abstract void transferMoney(double moneyToTransfer,CurrentAccount otherAcc);

	public void transferMoney(double moneyToTransfer,Account otherAcc) throws InsufficentFundException  {
		// Throw IllegalFundTransferException
		// No one allowed to transfer money to oursleves
		

//		try{
//			this.debitMoney(moneyToTransfer);
//		}
//		catch(Exception e){
//			e.getStackTrace();
//		}

		this.debitMoney(moneyToTransfer);
		otherAcc.creditMoney(moneyToTransfer);
		System.out.println("Money transferred Success");
	}
	
	

}
	
	
	
	
