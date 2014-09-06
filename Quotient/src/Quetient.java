// Odi-Rodrigue P. Ikenna-Odom
// CSC 201
// Spring 2010
import java.util.*;
import java.awt.*;

public class Quetient {
	public static void main( String [] args) {
		Scanner kybd = new Scanner(System.in);
		for ( ; ; ) {

		System.out.println("Enter Two Integers");
		int num1 = kybd.nextInt ();
		int num2 = kybd.nextInt ();

		try{
			if ( num2 == 0 )
			throw new ArithmeticException(" Vivisor cannot be Zero");
			System.out.println(num1 + " / " + num2 + " is " + (num1 / num2 ));
		}
		catch( ArithmeticException ex) {
			System.out.println(" Exception; an integer " + " Cannot be divided by zero");
		}
		System.out.println("Execution continues");

			if ( num2 != 0)
		System.out.println(num1 + " / " + num2 + " is " + (num1 / num2 ));
		else
		System.out.println(" Divisor cannot be zero");

	}
}
}