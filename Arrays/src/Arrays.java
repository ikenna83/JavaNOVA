// Odi-Rodrigue P. Ikenna-Odom
// CSC 201
//Spring 2010
import java.util.*;
import javax.swing.*;

class arrays {

   public static void main(String [] args) {

      int [] array= new int[6];

      while(true){

         String input= JOptionPane.showInputDialog("\n\tMake a Selection from the following choices"
            + "\n\t1 to Input values into the array"
            + "\n\t2 to Print Array Elements"
            + "\n\t3 Sum all values"
            + "\n\t4 Find largest value"
            + "\n\t5 Fing all prime numbers"
            + "\n\t6 Exit\n");

   int n= Integer.parseInt(input);
   switch (n){
       case 1:
             inputValues(array);
             break;
       case 2:
             print_array(array);
             break;
       case 3:
             System.out.print("\n\tThe sum of the Elements is :" + sum(array));
             break;
       case 4:
             System.out.print("\n\tThe largest Element is :" + largest(array));
             break;
       case 5:
             for ( int index = 0; index < array.length; index++) {
         if ( prime_numbers( array[index] ))
            System.out.println(array[index] + " Is a Prime Number");
		}
             break;
       case 6:
             System.out.println("\n\tEnd of program");
             System.exit(0);
       default:
             System.out.println("\n\tinvalid Selection! Make another Selection!");
         }

            }
            }
public static boolean prime_numbers ( int a ) {
	if ( a == 1 ) return true;
	if ( a == 2 ) return true;
	if ( a%2 == 0 ) return false;
	int k = 3;
	while ( k*k <= a ) {
		if ( a%k == 0 ) return false;
		k += 2;
}
return true;
}


public static void print_array(int[]a) {
    System.out.println("\n\tThe Array Elements are : ");
    for(int index = 0; index < a.length; index++){
        System.out.print("    " + a[index]);
    }
}
public static double sum( int[] a) {
    double totalValues = 0;
    for (int index = 0; index < a.length; index++){
        totalValues += a[index];
    }
    return totalValues;
}
public static double largest( int[] a) {
    double largestValue = a[0];
    for (int index = 1; index < a.length; index++){
        if (a[index] > largestValue)
        largestValue = a[index];
    }
    return largestValue;
}
public static void inputValues( int[] a) {
    Scanner kybd = new Scanner(System.in);
    System.out.println("\n\tEnter  " + a.length + " Values ");
    for (int index = 0; index < a.length; index++){
        a[index] = kybd.nextInt();
    }
}
}