package com.adi.Banking.Entity;

public abstract class Account {
	int accId;
	protected double accBalance;
	
	public Account(int accId, double accBalance) {
		super();
		this.accId = accId;
		this.accBalance = accBalance;
	}

	public abstract void creditMoney(double moneyToCredited);
	
	public abstract void debitMoney(double moneyToDebited);

//	public abstract void transferMoney(double moneyToTransfer,SavingAccount otherAcc);
//	public abstract void transferMoney(double moneyToTransfer,CurrentAccount otherAcc);

	public void transferMoney(double moneyToTransfer,Account otherAcc) {
		this.debitMoney(moneyToTransfer);
		otherAcc.creditMoney(moneyToTransfer);
		System.out.println("Money transferred Success");
	}
	
	

}
	
	
	
	
