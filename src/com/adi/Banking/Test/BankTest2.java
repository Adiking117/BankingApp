package com.adi.Banking.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.adi.Banking.Entity.Account;
import com.adi.Banking.Entity.CurrentAccount;
import com.adi.Banking.Entity.SavingAccount;

public class BankTest2 {

    public static void main(String[] args) {
        int[] arr = {1,12,16,68,29,20,40,77};

        // for(int i = 0 ; i<arr.length ; i++ ){
        //     System.out.println(arr[i]);
        // }

        double[] arr1 = {1.0,3.4,54.5};

        String[] arrStrings = {"Aditya","Shriraj","Dhiraj","Tanmay"};

        // for(int i = 0 ; i<arrStrings.length ; i++ ){
        //     System.out.println(arrStrings[i]);
        // }

        Account shrirajAccount = new SavingAccount(1,10000);
		Account adityaAccount = new SavingAccount(2,1000);
		Account dhirajAccount = new CurrentAccount(3,5000);
		Account tanmayAccount = new CurrentAccount(4,9000);

        Account[] accounts = {shrirajAccount,adityaAccount,dhirajAccount,tanmayAccount};

        // System.out.println(accounts[0]);
        // System.out.println(accounts[1]);
        // System.out.println(accounts[2]);

        // for(int i = 0;i<accounts.length;i++){
        //     System.out.println(accounts[i]);
        // }

        // for(Account acc : accounts){
        //     System.out.println(acc);
        // }

        List<Account> accountList = new ArrayList<>();

        // accountList.add(adityaAccount);
        // accountList.add(shrirajAccount);
        // accountList.add(dhirajAccount);
        // accountList.add(tanmayAccount);

        for(Account acc : accounts){
            accountList.add(acc);
        }

        System.out.println(accountList);
        
        






        
        
        
        

        




        

        // System.out.println("Aditya");
        // Println bts

    }
}
