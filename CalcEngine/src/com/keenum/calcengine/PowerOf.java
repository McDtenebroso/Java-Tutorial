package com.keenum.calcengine;

// Example of a class implementing an interface
public class PowerOf implements IMathProcessing {

	public String getKeyword()
	{
		return "Power";
	}

	public char getSymbol()
	{
		return '^';
	}

	public double doCalculations(double leftVal, double rightVal)
	{
		return Math.pow(leftVal, rightVal);
	}

}
