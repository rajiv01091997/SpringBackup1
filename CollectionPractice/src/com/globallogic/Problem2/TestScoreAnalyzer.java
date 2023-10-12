package com.globallogic.Problem2;

import java.util.Scanner;

public class TestScoreAnalyzer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ScoreAnalyzer scoreAnalyzer=new ScoreAnalyzer();
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of scores");
int n=sc.nextInt();
System.out.println("Enter Runs:");
for(int i=1;i<=n;i++)
{
int marks=sc.nextInt();
scoreAnalyzer.addRunsToList(marks);
}
scoreAnalyzer.displayRuns();
System.out.println();
System.out.println("Runrate: "+scoreAnalyzer.calcRunRate());
System.out.println("Lowest Run: "+scoreAnalyzer.lowestRunsScored());
scoreAnalyzer.countOfPlayer();

	}

}
