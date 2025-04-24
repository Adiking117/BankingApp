package com.adi.Banking.Test;

import com.adi.Banking.Entity.Account;
import com.adi.Banking.Entity.CurrentAccount;
import com.adi.Banking.Entity.SavingAccount;

public class BankTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account shrirajAccount = new SavingAccount(1,10000);
		Account adityaAccount = new SavingAccount(2,1000);
		
//		shrirajAccount.debitMoney(5000);
//		adityaAccount.creditMoney(5000);
		
		shrirajAccount.transferMoney(5000, adityaAccount);
		// Account otherAcc = (Account) adityaAccount;
		
		Account tanmayAccount = new CurrentAccount(3, 10000);
		Account dhirajAccount = new CurrentAccount(4, 10000000);
		
//		tanmayAccount.creditMoney(4000);
//		dhirajAccount.debitMoney(2500000);
		
		dhirajAccount.transferMoney(10000, tanmayAccount);

		// test to check to add
				
		
	}

}
