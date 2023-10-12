package com.globallogic.practice;

import java.util.Scanner;

public class Sorting_10 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
		{
		ar[i]=sc.nextInt();
		}
		Sort_Ascend(ar);
	}
	public static void Sort_Ascend(int ar[])
	{

	  for(int i=0;i<ar.length-1;i++)
	   {for(int j=0;j<ar.length-i-1;j++)
	    {
	    if(ar[j]>ar[j+1])
	       {
	       int temp;
	        temp=ar[j];
	         ar[j]=ar[j+1];
	        ar[j+1]=temp;
	       }
	    }
	  } 
	  System.out.println("Sorted Array in Ascending order:");
	  for(int i=0;i<ar.length;i++)
	  System.out.print(ar[i]+" ");


	}

}
