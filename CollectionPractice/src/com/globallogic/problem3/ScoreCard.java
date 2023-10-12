package com.globallogic.problem3;
import java.util.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class ScoreCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
     Map<String,Integer> map=new TreeMap<>();
     System.out.println("Enter the number of batsmen");
     int numOfPlayers=sc.nextInt();
     System.out.println("Enter name of player and score");
     for(int i=1;i<=numOfPlayers;i++)
     {
    	 map.put(sc.next(), sc.nextInt());
     }
		Set<String> nameOfPlayers=map.keySet();
		System.out.println("Players who batted:");
		System.out.println("==================");
		for(String name:nameOfPlayers)
		{
			System.out.println(name);
		}
		System.out.println("Scores by Players:");
		System.out.println("==================");
		for(Map.Entry<String,Integer> entry :map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		Collection<Integer> values=map.values();
		int sum=0;
		for(Integer val:values)
		{
			sum+=val;
		}
		System.out.println("==================");
		System.out.println("Total score: "+sum);
		System.out.println("==================");
		Map.Entry<String, Integer> max=null;
		for(Map.Entry<String,Integer> entry:map.entrySet())
		{
			if(max==null||entry.getValue()>max.getValue())
			{
				max=entry;
			}
		}
		System.out.println("Name of Highest Scorer: "+max.getKey());
		System.out.println("==================");
		System.out.println("Runs scored by Dhoni: "+map.get("Dhoni"));
		
	}

}
