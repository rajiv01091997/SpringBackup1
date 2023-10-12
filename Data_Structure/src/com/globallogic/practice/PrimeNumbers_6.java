package com.globallogic.practice;

import java.util.Scanner;

public class PrimeNumbers_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the maximum limit:");
		int n=sc.nextInt();
		for(int i=2;i<=n;i++)
		primeCheck(i);	
	}
	
	public static void primeCheck(int number)
	{int flag=0;
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
			{
				flag++;
				break;
			}
		}
		if(flag!=1)
		System.out.print(number+" ");
	}

}
