package com.globallogic.practice;

import java.util.Scanner;

public class Pattern_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of lines:");
		int noOfLines=sc.nextInt();
		for(int i=1;i<=noOfLines;i++)
		{
			for(int j=1;j<=noOfLines-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print((noOfLines-i+k));
				
			}
		for(int l=1;l<=i-1;l++)
		{
			System.out.print((noOfLines-l));
		}
			System.out.println();
		}
	}

}
