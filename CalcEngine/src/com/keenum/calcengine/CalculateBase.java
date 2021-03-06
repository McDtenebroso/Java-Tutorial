package com.keenum.calcengine;

public abstract class CalculateBase {

	private double leftVal;
	private double rightVal;
	private double result;
	
	// Getters and Setters
	public double getLeftVal()
	{
		return leftVal;
	}
	public void setLeftVal(double leftVal)
	{
		this.leftVal = leftVal;
	}
	
	public double getRightVal()
	{
		return rightVal;
	}
	public void setRightVal(double rightVal)
	{
		this.rightVal = rightVal;
	}
	
	public double getResult()
	{
		return result;
	}
	public void setResult(double result)
	{
		this.result = result;
	}
	
	// Constructor
	public CalculateBase() { }
	
	// Constructor
	public CalculateBase(double leftVal, double rightVal) {
		this.leftVal = leftVal;
		this.rightVal = rightVal;
	}
	
	// abstract method for the derived classes to override
	public abstract void calculate();
}
