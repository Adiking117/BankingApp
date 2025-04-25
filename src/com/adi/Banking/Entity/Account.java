package com.adi.Banking.Entity;

import com.adi.Banking.Exception.InsufficentFundException;

public abstract class Account {
	int accId;
	protected double accBalance;
	
	public Account(int accId, double accBalance) {
		super();
		this.accId = accId;
		this.accBalance = accBalance;
	}

	public abstract void creditMoney(double moneyToCredited);
	
	public abstract void debitMoney(double moneyToDebited) throws InsufficentFundException;

//	public abstract void transferMoney(double moneyToTransfer,SavingAccount otherAcc);
//	public abstract void transferMoney(double moneyToTransfer,CurrentAccount otherAcc);

	public void transferMoney(double moneyToTransfer,Account otherAcc) throws InsufficentFundException {
		try{
			this.debitMoney(moneyToTransfer);
		}
		catch(Exception e){
			e.getStackTrace();
		}
		otherAcc.creditMoney(moneyToTransfer);
		System.out.println("Money transferred Success");
	}
	
	

}
	
	
	
	
