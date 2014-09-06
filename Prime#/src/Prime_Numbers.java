// Odi-Rodrigue P. Ikenna-Odom
// CSC 201
// Spring 2010
import java.util.*;
public class Prime_Numbers{
public static void main(String[] args){
Scanner kybd = new Scanner(System.in);
while(true){
System.out.println("\n\tEnter any number\n");
int num = kybd.nextInt();
boolean flag = prime(num);
if ( flag == true)
System.out.println(" "  + num +  " Is a prime number \n");
else
System.out.println(" "  + num +  " Is not a prime number \n");
}
}
public static boolean prime(int n)
{
if (n == 1)return true;
if (n == 2)return true;
if (n%2 ==0)return false;
int k = 3;
while (k*k <=n)
{
if(n%k == 0)return false;
k = k+2;
}
return true;
}
}
