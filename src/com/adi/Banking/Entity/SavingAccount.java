package com.adi.Banking.Entity;

public class SavingAccount extends Account{


	
	public SavingAccount(int accId, double accBalance) {
		super(accId, accBalance);
	}

	@Override
	public void creditMoney(double moneyToCredited) {
		// TODO Auto-generated method stub
		accBalance += moneyToCredited;
		System.out.println(moneyToCredited+ " Money credited to "+accId + " now balance is "+accBalance);
	}

	@Override
	public void debitMoney(double moneyToDebited) {
		// TODO Auto-generated method stub
		accBalance -= moneyToDebited;
		System.out.println(moneyToDebited+ " Money debited from "+accId + " now balance is "+accBalance);

		
	}

//	@Override
//	public void transferMoney(double moneyToTransfer, Account otherAcc) {
//		this.debitMoney(moneyToTransfer); // Line 12
//		otherAcc.creditMoney(moneyToTransfer); // Line 6
//		System.out.println("Money transferred Success");
//		
////		this.accBalance -= moneyToTransfer;
////		otherAcc.accBalance += moneyToTransfer;	
//	}
	
	
	
}
