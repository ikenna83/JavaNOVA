/*author: Odi-Rodrigue P. Ikenna-odom
 * CSC 201 
 * Spring 2010
 * Exercise From pages 674, 690 & 715.
 * LINE-ORIENTED CALCULATOR
 * Exception handling, output & input files exercise:
 * The calculator needs to do +,-,*,/, save a value in memory, 
 * recall that value from memory and reset the result to zero.
 * Then create a text file and read that text file.
 */

import java.util.Scanner;

public class Calculator 
{
	private double result;
	private double precision = 0.0001;//This is to define a denominator as being a value
									  //very close to zero, which is then used within the switch
									  //statement down below. 
	
	public static void main(String[] args)
		throws DivideByZeroException, UnknownOpException //Exception to the main
	{
		Calculator clerk = new Calculator();//initiate the calculator
		try
		{
			System.out.println("Odi-Rodrigue's Calculator");
			System.out.println("Calculator ON.");
			System.out.println("FORMAT OF EACH LINE:");
			System.out.println("Operation, Space, Number (For example: + 3)");
			System.out.println("The calculator will RECALL THE PREVIOUS RESULT FROM THE MEMORY");
			System.out.println("THEN STARTS WITH ZERO.");
			System.out.println("To END, enter the letter e.");
			clerk.doCalculation();//Calls the class doCalculation.
		}
		catch(UnknownOpException e)//calls the handleUnknownOpException
		{
			clerk.handleUnknownOpException(e);
		}
		catch(DivideByZeroException e)//calls the handleDivideByZeroException
		{
			clerk.handleDivideByZeroException(e);
		}
		System.out.println("The final result is " + clerk.result);
		System.out.println("Calculator program ending.");
	}
	public Calculator()
	{
		result = 0;
	}
	public void handleDivideByZeroException(DivideByZeroException e)
	{
		System.out.println("DIVIDING BY ZERO.");
		System.out.println("PROGRAM ABORTED.");
		System.exit(0);
	}
	public void handleUnknownOpException(UnknownOpException e)
	{
		System.out.println(e.getMessage());
		System.out.println("Try again from the beginning:");
		
		try
		{
			System.out.println("Odi-Rodrigue's Calculator");
			System.out.println("Calculator ON.");
			System.out.println("FORMAT OF EACH LINE:");
			System.out.println("Operation, Space, Number (For example: + 3)");
			System.out.println("The calculator will RECALL THE PREVIOUS RESULT FROM THE MEMORY");
			System.out.println("THEN STARTS WITH ZERO.");
			System.out.println("To END, enter the letter e.");
			doCalculation();//Gives the user another chance to perform the calculations
		}
		catch(UnknownOpException e2)//This blocks catches and UnknownOpException 
		                            //if it is thrown a second time.
		{							
			System.out.println(e2.getMessage());
			System.out.println("Rerun and try Again.");
			System.out.println("PROGRAM ENDED.");
			System.exit(0);
		}
		catch(DivideByZeroException e3)
		{
			handleDivideByZeroException (e3);
		}
	}
	public void reset ()// inactive
	{
		result = 0;
	}
	public void setResultMemory (double newResult) // inactive
	{
		result = newResult;
	}
	public double getResultMemory() // inactive
	{
		return result;
	}
	public double evaluate(char op, double n1, double n2)
		throws DivideByZeroException, UnknownOpException
		{
			double answer;
			switch (op)  //Statement to define which operator is being used and,
			{		    //if the operator is valid.
				case '+':
					answer = n1 + n2;
					break;
				case '-':
					answer = n1 - n2;
					break;
				case '*':
					answer = n1 * n2;
					break;
				case '/':
					if((-precision < n2) & (n2 < precision))//Deals with division by zero.
						throw new DivideByZeroException();
					answer = n1 / n2;
					break;
				default://Deals with invalid operators.
					throw new UnknownOpException(op);
			}
			return answer;
		}
	public void doCalculation()
		throws DivideByZeroException, UnknownOpException
		{
			Scanner keyboard = new Scanner(System.in);
			boolean done = false;
			result = 0;
			System.out.println("result = " + result);
			
			while(!done)
			{
				char nextOp = (keyboard.next()).charAt(0);
				if((nextOp == 'e')||(nextOp == 'E'))
					done = true;
				else
				{
					double nextNumber = keyboard.nextDouble();
					result = evaluate(nextOp, result, nextNumber);
					System.out.println("result " + nextOp + " " + nextNumber + " = " + result);
					System.out.println("updated result = " + result);
				}
			}
		}
	public class DivideByZeroException extends Exception{
		
	}
	
	public class UnknownOpException extends Exception // Class to call the UnknownOpException
	{
		public UnknownOpException()
		{
			super ("UnknownOpException");
		}
		public UnknownOpException(char op)
		{
			super (op + " Illegal Operation.");
		}
		public UnknownOpException(String message)
		{
			super(message);
		}
	}
}

