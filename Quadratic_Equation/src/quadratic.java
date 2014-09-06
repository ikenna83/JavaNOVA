// Odi-Rodrigue P. Ikenna-Odom
// CSC 201
// Spring 2010
import java.util.*;

public class quadratic
{
public static void main(String[] args)
{
Scanner i = new Scanner(System.in);
String e = "( px^2 + qx + r = 0 1 )";

System.out.println("Your equation is " + e);
System.out.println("Please enter the values of coefficients p, q, r, separated by spaces");
System.out.println("p = "); double p = input.nextDouble();
System.out.println("q = "); double q = input.nextDouble();
System.out.println("r = "); double r = input.nextDouble();
System.out.println();

double dis = java.lang.Math.pow(q,2) - (4*p*r);
double r1 = ((-1 * q) + (java.lang.Math.sqrt(dis)))/(2*p);
double r2 = ((-1 * q) - (java.lang.Math.sqrt(dis)))/(2*p);

System.out.println(" " + e);
System.out.println("The coefficients you entered were " + "\nP = " + p + "\nQ = " + q + "\nR = " + r);
System.out.println();

if(dis > 0)
{
System.out.println("Root1: " + r1);
System.out.println("Root2: " + r2);
}
else if(dis == 0)
{
System.out.println("Root: " + r1);
}
else
{
double rp1complex = (-1 * q)/(2*p);
double rp1complex2 = (java.lang.Math.sqrt(dis/(-1)))/(2*p);

System.out.println(rp1complex + " + " + rp1complex + " i ");
System.out.println(" " + " and ");
System.out.println(rp1complex2 + " - " + rp1complex2 + " i ");
}

}
}