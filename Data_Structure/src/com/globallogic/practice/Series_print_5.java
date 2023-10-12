package com.globallogic.practice;

import java.util.Scanner;

public class Series_print_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms to be printed:");		
		int numberOfTerms=sc.nextInt();
		System.out.println("Series is:");
		for(int i=1;i<=numberOfTerms;i++)
		{
			System.out.print(i*i*i+" ");
		}

	}

}
