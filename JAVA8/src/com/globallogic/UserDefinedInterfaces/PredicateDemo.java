package com.globallogic.UserDefinedInterfaces;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> names=new ArrayList<>();
names.add("rahul");
names.add("karan");
names.add("saurabh");
names.add("manish");
names.add("john");
names.add("sachin");

Predicate<String> pred1=(name)-> name.startsWith("s");
Predicate<String> pred2=(name)-> name.contains("a");
checkStartWith(pred1, names);
nameContainsOrNot(pred2, names);
	}
public static void checkStartWith(Predicate p,ArrayList<String> n)
{
	for(String name:n)
	{
		if(p.test(name))
			System.out.println(name);
	}
}
public static void nameContainsOrNot(Predicate p,ArrayList<String> n)
{
	for(String name:n)
	{
		if(p.test(name))
			System.out.println(name);
	}
}
	
}
