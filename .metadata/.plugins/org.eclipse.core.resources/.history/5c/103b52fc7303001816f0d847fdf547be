package com.keenum.calcengine;

public class Main {

	public static void main(String[] args)
	{
		MathEquation[] equations = new MathEquation[4];
		equations[0] = new MathEquation('d', 100.0d, 50.0d);
		equations[1] = new MathEquation('a', 25.0d, 92.0d);
		equations[2] = new MathEquation('s', 225.0d, 17.0d);
		equations[3] = new MathEquation('m', 11.0d, 3.0d);

		for (MathEquation equation : equations)
		{
			equation.Calculate();
			System.out.println("Result = " + equation.getResult());
		}

		System.out.println("\nUsing Overlads\n");

		double leftDouble = 9;
		double rightDouble = 4;
		
		int leftInt = 9;
		int rightInt = 4;

		MathEquation equationOverload = new MathEquation('d');
		equationOverload.Calculate(leftDouble, rightDouble);
		System.out.println("Double = " + equationOverload.getResult());
		
		equationOverload.Calculate(leftInt, rightInt);
		System.out.println("Int = " + equationOverload.getResult());
		
		equationOverload.Calculate((double)leftInt, rightInt);
		System.out.println("Dbl/Int = " + equationOverload.getResult());
		

	}

}
