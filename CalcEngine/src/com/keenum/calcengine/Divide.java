package com.keenum.calcengine;

public class Divide extends CalculateBase {

	public Divide(){}
	
	public Divide(double leftVal, double rightVal)
	{
		super(leftVal, rightVal);
	}
	
	@Override
	public void calculate() 
	{
		if (!(getRightVal() == 0))
		{
			double value = getLeftVal() / getRightVal();
			setResult(value);
		}
	}
	
}
