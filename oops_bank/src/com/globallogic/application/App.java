package com.globallogic.application;

import com.globallogic.modal.Account;
import com.globallogic.service.AccountService;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Account acc1=new Account("32226129895","Rajiv",20000,"SBIN00076",9);
      AccountService obj1=new AccountService(acc1);
      System.out.println(acc1.getAccountHolderName());
      System.out.println(acc1.getAccountNumber());
      System.out.println(acc1.getIfscCode());
      obj1.withdraw(5000);
      obj1.deposit(10000);
      System.out.println(obj1.calculateRateOfInterest()+" Balance:"+obj1.getBalance());
      
	}

}
