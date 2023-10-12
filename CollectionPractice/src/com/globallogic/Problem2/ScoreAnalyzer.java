package com.globallogic.Problem2;

import java.util.Collections;
import java.util.LinkedList;

public class ScoreAnalyzer {
private LinkedList<Integer> runsdata=new LinkedList<>();

public ScoreAnalyzer() 
{
	
}

public void addRunsToList(int runs)
{
runsdata.add(runs);
}
public float calcRunRate()
{
int sum=0;
for(Integer run:runsdata)
{
	sum+=run;
}
return (float)sum/runsdata.size();
}
public int lowestRunsScored()
{
return Collections.min(runsdata);
}
public void displayRuns()
{
	int count=1;
	System.out.print("Runs Scored: ");
for(Integer run:runsdata)
{
	System.out.print(count+"-"+run+" ");
	count++;
}
}
public void countOfPlayer()
{
	System.out.println("count of players who batted: "+runsdata.size());
}
}
