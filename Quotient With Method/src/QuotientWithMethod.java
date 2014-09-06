// Odi-Rodrigue P. Ikenna-Odom
// CSC 201
// Spring 2010
import java.util.Scanner;

public class QuotientWithMethod {



		public static int Quotient(int num1, int num2) {
		if (num2 == 0)
		throw new ArithmeticException("Diviser cannot be zero");
		return num1 / num2;
	}

	public static void main (String[] args) {
		Scanner kybd = new Scanner(System.in);
		while ( true ) {
		//prompt user for input
		System.out.println(" Enter two Numbers ");
		int num1 = kybd.nextInt ();
		int num2 = kybd.nextInt ();

		try{
			int result = Quotient ( num1, num2);
			System.out.println(num1 + " / " + num2 + " is " + result);

		}
		catch ( ArithmeticException ex ) {
			System.out.println("Exception : an integer cannot be divided by zero");
		}
		System.out.println("Execution continues ");



	}
}

}