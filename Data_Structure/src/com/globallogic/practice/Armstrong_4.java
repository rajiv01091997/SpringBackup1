package com.globallogic.practice;

import java.util.Scanner;

public class Armstrong_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to be checked:");
		int n=sc.nextInt();
		armstrongCheck(n);	

	}
	
	public static void armstrongCheck(int number)
	{int digitFromEnd=0;
	int duplicateCopy=number;
	int newNumber=0;
		
		while(number>0)
		{
			digitFromEnd=number%10;
			number=number/10;
			newNumber=newNumber+(int)Math.pow(digitFromEnd,3);
		}
		if(newNumber==duplicateCopy)
			System.out.println("Armstrong number");
		else
			System.out.println("Not a Armstrong number");
	}

}
