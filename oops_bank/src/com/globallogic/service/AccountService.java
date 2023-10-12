package com.globallogic.service;

import com.globallogic.modal.Account;

public class AccountService {
	Account acc;
	
	public AccountService(Account acc)
	{
		this.acc=acc;
	}

	public void withdraw(int amount)
	{
		if(amount<=acc.getBalance())
		{
			acc.setBalance(acc.getBalance()-amount);
			System.out.println("Withdrawal Success");
			System.out.println("Your balance is:"+acc.getBalance());
			
		}
		else
		{
			System.out.println("Insufficient balance");
		}
	}
	public void deposit(int amount)
	{
		System.out.println("Deposited");
		acc.setBalance(acc.getBalance()+amount);
		System.out.println("your Balance is:"+acc.getBalance());
	}
	public int getBalance()
	{    acc.setBalance((int)acc.getBalance()+(int)calculateRateOfInterest());
		return acc.getBalance();
	}
	public float calculateRateOfInterest()
	{
		return (acc.getBalance()*acc.getRateOfInterest())/100;
	}
	
}
