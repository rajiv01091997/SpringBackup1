package com.globallogic.Application;

import com.globallogic.Calculator.AdvancedCalculator;
import com.globallogic.Calculator.ScientificCalculator;
import com.globallogic.Calculator.SimpleCalculator;

public class Multilevel_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calling only simple calculator
		System.out.println("Simple Calculator______________________________________________");
		SimpleCalculator simple=new SimpleCalculator("Vaio", "Black", 12345, 100, 50);
		System.out.println("Addition:"+simple.Addition());
		System.out.println("Subtraction:"+simple.Subtraction());
		
		
		System.out.println("\n"+"Advanced Calculator______________________________________________");
		AdvancedCalculator advance=new AdvancedCalculator("Acco", "Blue", 67890, 10, 20);
		System.out.println("Addition:"+advance.Addition());
		System.out.println("Subtraction:"+advance.Subtraction());
		System.out.println("Multiply:"+advance.Multiply());
		System.out.println("Divide:"+advance.Divide());
		
		
		System.out.println("\n"+"Scientific Calculator______________________________________________");
		ScientificCalculator scientific= new ScientificCalculator("CASIO","White",11111,9,2);
		System.out.println("Addition:"+scientific.Addition());
		System.out.println("Subtraction:"+scientific.Subtraction());
		System.out.println("Multiply:"+scientific.Multiply());
		System.out.println("Divide:"+scientific.Divide());
		System.out.println("power:"+scientific.findPower());
		System.out.println("Root:"+scientific.Root());
		
		

	}

}
