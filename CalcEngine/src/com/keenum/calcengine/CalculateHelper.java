package com.keenum.calcengine;

public class CalculateHelper {
	
	private final static char ADD_SYMBOL = '+';
	private final static char SUBTRACT_SYMBOL = '-';
	private final static char MULTIPLY_SYMBOL = '*';
	private final static char DIVIDE_SYMBOL = '/';
			
	
	MathCommand command;
	double leftVal;
	double rightVal;
	double result;
	
	// Example of throwing exceptions
	public void process(String statement) throws InvalidStatementException
	{
		String[] parts = statement.split(" ");
		
		if (parts.length != 3)
		{
			throw new InvalidStatementException("Incorrect Number of Fields", statement);
		}
		
		
		String commandString = parts[0];
		
		try
		{
			leftVal = Double.parseDouble(parts[1]);
			rightVal = Double.parseDouble(parts[2]);
		}
		catch (NumberFormatException e)
		{
			throw new InvalidStatementException("Non-Numeric Value Entered", statement, e);
		}
		
		setCommandFromString(commandString);
		if (command == null)
		{
			throw new InvalidStatementException("Invalid Command Entered", statement);
		}
		
		CalculateBase calculator = null;
		
		switch (command)
		{
			case Add:
				calculator = new Add(leftVal, rightVal);
				break;
			case Subtract:
				calculator = new Subtract(leftVal, rightVal);
				break;
			case Multiply:
				calculator = new Multiply(leftVal, rightVal);
				break;
			case Divide:
				calculator = new Divide(leftVal, rightVal);
				break;
		}
		
		calculator.calculate();
		result = calculator.getResult();
		
	}
	
	private void setCommandFromString(String commandString)
	{
		if (commandString.equalsIgnoreCase(MathCommand.Add.toString()))
			command = MathCommand.Add; 
		else if (commandString.equalsIgnoreCase(MathCommand.Subtract.toString()))
			command = MathCommand.Subtract;
		else if (commandString.equalsIgnoreCase(MathCommand.Multiply.toString()))
			command = MathCommand.Multiply;
		else if (commandString.equalsIgnoreCase(MathCommand.Divide.toString()))
			command = MathCommand.Divide;
	}
	
	@Override
	public String toString()
	{
		char symbol = ' ';
		switch (command)
		{
			case Add:
				symbol = ADD_SYMBOL;
				break;
			case Subtract:
				symbol = SUBTRACT_SYMBOL;
				break;
			case Multiply:
				symbol = MULTIPLY_SYMBOL;
				break;
			case Divide:
				symbol = DIVIDE_SYMBOL;
				break;
		}
		
		// Example of a string builder
		StringBuilder sb = new StringBuilder(20);
		sb.append(leftVal);
		sb.append(" ");
		sb.append(symbol);
		sb.append(" ");
		sb.append(rightVal);
		sb.append(" = ");
		sb.append(result);
		
		
		return sb.toString();
	}
}
