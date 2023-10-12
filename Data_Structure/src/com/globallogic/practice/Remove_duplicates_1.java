package com.globallogic.practice;
import java.util.*;

public class Remove_duplicates_1 {

	public static void main(String[] args)//main funtion
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of array:");
	int n=sc.nextInt();
	int ar[]=new int[n];
	System.out.println("Enter values in array:");
	for(int i=0;i<n;i++)
	{
		ar[i]=sc.nextInt();
	}
	removeDuplicates(ar);

	}
	//funtion for Removing duplicates from array
	public static void removeDuplicates(int ar[])
	{int duplicateIndex=-1;
		Arrays.sort(ar);
		//find first duplicate value
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==ar[i+1])
			{
				duplicateIndex=i;
				break;
			}
		}int i=duplicateIndex+1;
		while(i<ar.length)
		{
			if(ar[i]!=ar[duplicateIndex])
			{
				duplicateIndex++;
				ar[duplicateIndex]=ar[i];
				i++;
			}
			else
				i++;
		}
		System.out.println("Unique elements:");
		for(int j=0;j<=duplicateIndex;j++)
			System.out.print(ar[j]+" ");
	}

}


