package com.adi.Banking.Entity;

public class CurrentAccount extends Account{

	public CurrentAccount(int accId, double accBalance) {
		super(accId, accBalance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void creditMoney(double moneyToCredited) {
		// TODO Auto-generated method stub
		accBalance += moneyToCredited - (moneyToCredited * 10/100);
		System.out.println(moneyToCredited+ " Money credited to "+accId + " now balance is "+accBalance);

	}

	@Override
	public void debitMoney(double moneyToDebited) {
		// TODO Auto-generated method stub
		accBalance -= moneyToDebited + (moneyToDebited * 10/100);
		System.out.println(moneyToDebited+ " Money debited from "+accId + " now balance is "+accBalance);

	}

//	@Override
//	public void transferMoney(double moneyToTransfer, Account otherAcc) {
//		this.debitMoney(moneyToTransfer);
//		otherAcc.creditMoney(moneyToTransfer);
//		System.out.println("Money transferred Success");
//
//	}

	
}
