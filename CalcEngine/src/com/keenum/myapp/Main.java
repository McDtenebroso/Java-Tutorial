package com.keenum.myapp;

import com.keenum.calcengine.Add;
import com.keenum.calcengine.CalculateBase;
import com.keenum.calcengine.CalculateHelper;
import com.keenum.calcengine.Divide;
import com.keenum.calcengine.DynamicHelper;
import com.keenum.calcengine.IMathProcessing;
import com.keenum.calcengine.InvalidStatementException;
import com.keenum.calcengine.MathEquation;
import com.keenum.calcengine.Multiply;
import com.keenum.calcengine.PowerOf;
import com.keenum.calcengine.Subtract;

public class Main {

	// Call math equations using different methods
	public static void main(String[] args)
	{
		useMathEquation();
		useOverloadEquation();
		useInheritanceEquation();
		useCalculateEquation();
		useInterfaceEquation();
	}
	
	private static void useInterfaceEquation()
	{
		String[] statements = { 
				"add 25 92", // 25.0 + 92.0 = 117.0
				"power 5 2"  // 5.0 ^ 2.0 = 25.0
				}; 
		
		// Example of using an interface
		DynamicHelper helper = new DynamicHelper(new IMathProcessing[] 
		{
			new Add(),
			new PowerOf()
		});
		
		System.out.println ("\nUsing Interface");
		for (String statement:statements)
		{
			String output = helper.process(statement);
			System.out.println(output);
		}
		
	}

	// Example of using Enums and Error Handling
	private static void useCalculateEquation()
	{
		// Example of Error Handling
		String[] statements = {
				"add 1",			// Error: incorrect number of values
				"add xx 25",		// Error: non-numeric number
				"addX 0 0",			// Error: invalid command
				"divide 100 50",
				"add 25 92",
				"subtract 225 17",
				"multiply 3 11"
		};
		
		System.out.println("\nUsing Enums");
		CalculateHelper helper = new CalculateHelper();
		for (String statement:statements)
		{
			try
			{
				helper.process(statement);
				System.out.println(helper);
			}
			catch (InvalidStatementException e) 
			{
				System.out.println(e.getMessage());
				if (e.getCause() != null)
				{
					System.out.println("  Original Exception: " + e.getCause().getMessage());
				}
			}
		}
		
	}

	// Basic use of a class
	static void useMathEquation(){
		MathEquation[] equations = new MathEquation[4];
		equations[0] = new MathEquation('d', 100.0d, 50.0d);
		equations[1] = new MathEquation('a', 25.0d, 92.0d);
		equations[2] = new MathEquation('s', 225.0d, 17.0d);
		equations[3] = new MathEquation('m', 11.0d, 3.0d);

		System.out.println("\nOriginal Calcualations");
		
		for (MathEquation equation : equations)
		{
			equation.Calculate();
			System.out.println("Result = " + equation.getResult());
		}
	}
	
	// Example of using overloads
	static void useOverloadEquation()
	{
		System.out.println("\nUsing Overloads");

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

	// Example of using Inheritance
	static void useInheritanceEquation()
	{
		System.out.println("\nUsing Inheritance");
		
		CalculateBase[] calculators = 
		{
				new Divide(100, 50),
				new Add(25, 92),
				new Subtract(225, 17),
				new Multiply(11,3)
		};
		
		for(CalculateBase calculator : calculators)
		{
			calculator.calculate();
			System.out.println("Result = " + calculator.getResult());
		}
		
	}
	
}
