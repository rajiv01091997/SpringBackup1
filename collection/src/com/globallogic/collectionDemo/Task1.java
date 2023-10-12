package com.globallogic.collectionDemo;
import java.util.*;
public class Task1 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> teamA=new ArrayList<String>();
teamA.add("virat");
teamA.add("rohit");
teamA.add("surya");
teamA.add("shreyas");
teamA.add("pant");
System.out.println("team A:"+teamA);

List<String> teamB=new ArrayList<String>();
teamB.add("pant");
teamB.add("dhawan");
teamB.add("siraj");
teamB.add("samson");
teamB.add("surya");
System.out.println("team b:"+teamB);
teamA.addAll(teamB);
System.out.println("List after merging:"+teamA);
Set<String> set=new LinkedHashSet<>();
set.addAll(teamA);
System.out.println("List after removing duplicates:"+set);
Set<String> finalSet=new TreeSet<>();
finalSet.addAll(set);
System.out.println("List after Sorting:"+finalSet);



	}

}
