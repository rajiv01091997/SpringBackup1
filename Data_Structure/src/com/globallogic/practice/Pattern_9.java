package com.globallogic.practice;

import java.util.Scanner;

public class Pattern_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of lines:");
		int noOfLines=sc.nextInt();
		for(int i=1;i<=noOfLines;i++)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=noOfLines-i+1;k++)
			{
				System.out.print(k);
				
			}
		for(int l=noOfLines-i;l>=1;l--)
		{
			System.out.print(l);
		}
			System.out.println();
		}
	}

}
