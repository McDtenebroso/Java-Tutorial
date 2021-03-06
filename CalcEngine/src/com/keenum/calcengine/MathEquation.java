package com.keenum.calcengine;

public class MathEquation {

	private double leftVal;
	private double rightVal;
	private char opCode = 'a';
	private double result;

	// Constructor
	public MathEquation(){

	}
	
	
	// Second Constructor
	public MathEquation(char opCode){
		this.opCode = opCode;
	}
	
	// Third Constructor
	public MathEquation(char opCode, double leftVal, double rightVal){
		this(opCode);
		this.leftVal = leftVal;
		this.rightVal = rightVal;
	}
	
	
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
	
	public double getOpCode()
	{
		return opCode;
	}
	public void setOpCode(char opCode)
	{
		this.opCode = opCode;
	}

	public double getResult(){
		return result;
	}
	
	
	// Overloaded Calculate for doubles
	public void Calculate(double leftVal, double rightVal)
	{
		this.leftVal = leftVal;
		this.rightVal = rightVal;
		
		Calculate();		
	}
	
	// Overloaded Calculate for integers
	public void Calculate(int leftVal, int rightVal)
	{
		this.leftVal = leftVal;
		this.rightVal = rightVal;
		
		Calculate();	
		result = (int) result;
	}
	
	// Method to calculate what Math function to call
	public void Calculate()
	{
		switch (opCode)
		{
			case 'a':
				result = leftVal + rightVal;
				break;
			case 's':
				result = leftVal - rightVal;
				break;
			case 'd':
				result = rightVal != 0.0d ? leftVal / rightVal : 0.0d;
				break;
			case 'm':
				result = leftVal * rightVal;
				break;
			default:
				System.out.println("Error - invalid opCode!");
				result = 0;
				break;
		}
	}

}
