package com.globallogic.practice;

import java.util.Scanner;

public class Count_Characters_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String string=sc.nextLine();
        string=string.replaceAll("\\s","");//to remove the spaces between the words since we do not need it
        
        boolean ar[]=new boolean[string.length()];
        for(int i=0;i<string.length();i++)
        {
        	if(ar[i]==true)
        		continue;
        	int count=1;
        	ar[i]=true;
        	for(int j=i+1;j<string.length();j++)
        	{
        		if(string.charAt(j)==string.charAt(i))
        		{
        			count++;
        			ar[j]=true;
        		}
        	}
        	System.out.println(string.charAt(i)+":"+count);
        }
        
	}

}
