package com.keenum.calcengine;

// Example of an interface
public interface IMathProcessing {

	String SEPARATOR = " ";
	String getKeyword(); // Add
	char getSymbol(); // '+'
	double doCalculations(double leftVal, double rightVal);
	
}
