package com.globallogic.Calculator;

public class SimpleCalculator {
	private String brand;
	private String color;
	private int modelNumber;
	private int firstInput;
	private int secondInput;
	public SimpleCalculator(String brand, String color, int modelNumber, int firstInput, int secondInput) {
		super();
		this.brand = brand;
		this.color = color;
		this.modelNumber = modelNumber;
		this.firstInput = firstInput;
		this.secondInput = secondInput;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}
	public int getFirstInput() {
		return firstInput;
	}
	public void setFirstInput(int firstInput) {
		this.firstInput = firstInput;
	}
	public int getSecondInput() {
		return secondInput;
	}
	public void setSecondInput(int secondInput) {
		this.secondInput = secondInput;
	}
	public int Addition()
	{
		return firstInput+secondInput;
	}
	public int Subtraction()
	{
		return secondInput-firstInput;
	}
	

}
