package com.globallogic.Interface;

interface Bank
{
	default void Greeting()//default method
	{
		System.out.println("Welcome!!!!!");
	}
	void payment();
}
interface RBI extends Bank
{
	//void payment();
	void withdrawaLimit();
}
class Cash implements RBI
{

	@Override
	public void payment() {
		// TODO Auto-generated method stub
		System.out.println("CASH payment only");
	}

	@Override
	public void withdrawaLimit() {
		// TODO Auto-generated method stub
		System.out.println(15000);
	}
	
}

class UPI implements RBI
{

	@Override
	public void payment() {
		// TODO Auto-generated method stub
		System.out.println("Only UPI accepted");
	}

	@Override
	public void withdrawaLimit() {
		// TODO Auto-generated method stub
		System.out.println(20000);
	}
	
}
class BanktTransfer implements RBI
{

	@Override
	public void payment() {
		// TODO Auto-generated method stub
		System.out.println("Bank transfer only");
	}

	@Override
	public void withdrawaLimit() {
		// TODO Auto-generated method stub
		System.out.println("30000");
	}
	
}

public class Interfacedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RBI bank=new BanktTransfer();/*Upcasting is used to make the code loosely coupled
                               here we can just change the name of the class 
                               and call their implementations respectively*/
bank.Greeting();
bank.payment();
bank.withdrawaLimit();
	}

}
 

