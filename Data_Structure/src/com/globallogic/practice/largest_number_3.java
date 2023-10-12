package com.globallogic.practice;

import java.util.Scanner;

public class largest_number_3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter values in array:");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Largest Element is:"+largestNumber(ar));
	}
	
	public static int largestNumber(int ar[])
	{int large=Integer.MIN_VALUE;
	  for(int i=0;i<ar.length;i++)
	  {
		  if(ar[i]>large)
			  large=ar[i];
	  }
		return large;
	}

}
