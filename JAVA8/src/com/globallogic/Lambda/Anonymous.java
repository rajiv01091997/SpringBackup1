package com.globallogic.Lambda;

public class Anonymous {
public static void main(String args[])
{
	Calculate calculate=new Calculate()
			{
		public int mathematics(int a,int b)
		{
			if(a>b)
				return a;
			else return b;
		}
			};

		System.out.println(calculate.mathematics(7, 20));
	
}
}
