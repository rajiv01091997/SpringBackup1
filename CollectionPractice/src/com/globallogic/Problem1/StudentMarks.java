package com.globallogic.Problem1;
import java.util.*;
public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("===========================================================================");
		System.out.println("Enter the number of Students:");
		int n=sc.nextInt();
		List<Integer> list=new ArrayList<>();
		System.out.println("===========================================================================");
		System.out.println("Enter the marks:");
		for(int i=0;i<n;i++)
		{
			list.add(sc.nextInt());
		}
		System.out.println("===========================================================================");
		System.out.println("Highest marks: "+Collections.max(list));
		int sum=0;
		for(Integer marks:list)
		{
			sum=sum+marks;
		}
		System.out.println("===========================================================================");
		System.out.println("Average marks: "+(float)sum/list.size());
		System.out.println("===========================================================================");
		System.out.println("Marks Scored by 3rd Student: "+list.get(2));
		System.out.println("===========================================================================");
		System.out.println("Marks:");
		int index=1;
		for(Integer marks:list)
		{
		System.out.print(index+"-"+marks+" ");
		index++;
		}
		System.out.println();
		System.out.println("===========================================================================");
		System.out.println("Sorted List Displaying using Iterator");
		Collections.sort(list);
		Iterator<Integer> iterator=list.iterator();
		int count=1;//for printing index of each marks
		while(iterator.hasNext())
		{
			System.out.print(count+"-"+iterator.next()+" ");
			count++;
		}
		
		
		
		
	}

}
