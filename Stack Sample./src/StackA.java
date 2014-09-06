// Odi-Rodrigue P. Ikenna-Odom
// CSC 202
// Summer 2010

import java.util.*;
import javax.swing.*;

public class StackA  {
    private static int  [ ] theArray;
    private static int  topOfStack;

    private static final int DEFAULT_CAPACITY = 10;

public StackA( ) {
   theArray = (int []) new int[DEFAULT_CAPACITY];
   topOfStack = -1;
}
public static boolean isEmpty() {
   return (topOfStack == -1);
}
public static void makeEmpty( ) {
   topOfStack = -1;
}
public static int top( ) {
    if( isEmpty( ) ) return 0;
    return theArray[topOfStack];
}
public static int pop( ) {
     if( isEmpty( ) ) return 0;
     return theArray[topOfStack--];
}

public static void _print( ) {
     int temp = topOfStack;
     while(temp != -1) {
		 System.out.print("  " + theArray[temp--]);
	 }
}
public static void push( int x ) {
  //if( topOfStack + 1 == theArray.length )
     //doubleArray( );
  theArray[++topOfStack] = x;
}
public static void main(String [] args ){
    Scanner kybd = new Scanner(System.in);
    StackA stack = new StackA();
    String input;
    int n,num;
  while(true) {
        input =
          JOptionPane.showInputDialog("\n\tMake a selection from the following"
                + "\n\t1 Push an item into the stack "
                + "\n\t2 Pop an item from the stack "
                + "\n\t3 Check if stack is empty "
                + "\n\t4 Return top of Stack item "
                + "\n\t5 Print stack items "
                + "\n\t6 Exit program \n\n");


  n = Integer.parseInt(input);
 switch (n) {
	 case 1:
	    System.out.println("Enter an Integer");
	    num = kybd.nextInt();
	    stack.push(num);
	    break;
	 case 2:
	 	break;
	 case 3:
	 	break;
	 case 4:
	 	break;
	 case 5:
	 	stack._print();
	 	break;
	 case 6:
	 	System.out.println("End of Program");
	 	System.exit(0);
	 default:
	 	System.out.println("Invalid Selection");
 }
}
}

}
