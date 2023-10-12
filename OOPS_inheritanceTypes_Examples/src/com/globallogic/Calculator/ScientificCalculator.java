package com.globallogic.Calculator;

public class ScientificCalculator extends AdvancedCalculator{

	public ScientificCalculator(String brand, String color, int modelNumber, int firstInput, int secondInput) {
		super(brand, color, modelNumber, firstInput, secondInput);
		// TODO Auto-generated constructor stub
	}
	public int findPower()
	{
		return ((int)Math.pow(getFirstInput(),getSecondInput()));
	}
	
 public double Root()
 {
	 return Math.sqrt(getFirstInput());
 }

}
