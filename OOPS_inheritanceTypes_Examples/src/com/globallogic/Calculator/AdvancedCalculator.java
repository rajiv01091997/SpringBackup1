package com.globallogic.Calculator;

public class AdvancedCalculator extends SimpleCalculator{
	
	public AdvancedCalculator(String brand, String color, int modelNumber, int firstInput, int secondInput) {
		super(brand, color, modelNumber, firstInput, secondInput);
		// TODO Auto-generated constructor stub
	}
	public int Multiply()
	{
		return getFirstInput()*getSecondInput();
	}
    public int Divide()
    {
    	return getSecondInput()/getFirstInput();
    }
    
}
