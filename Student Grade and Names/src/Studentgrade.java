// Odi-Rodrigue P. Ikenna-Odom
// CSC 201
// Spring 2010
// Exam2 section( write Programs)
// Question (a)
        import java.util.Scanner;
		public class Studentgrade {	
			public static void main(String[] args) {
				int num_of_student ;
				Scanner input = new Scanner(System.in);
				System.out.println("Enter the  number of Student :");
				num_of_student = input.nextInt();
				String []name = new String [num_of_student] ;
				int array[] = new int [num_of_student];
				String Exit = "exit :";
				int sum=0;
				int avg;
				int max = array[0]=100;
				int min = array[0]=0;
				String maxi = null;
				String mini = null ; 
				        for ( int j = 0; j< array.length; j++ ) {
				        	System.out.println("Enter Student Grade :");
				        	array[j]=input.nextInt();
				        	sum=sum+array[j];
				        	if (array[j] > max) {
								max = array[j];						
							}
							if (array[j] < min) {
								min = array[j];							
							}
				        }
				        avg= sum/array.length ;
				        for (int j=0 ; j<array.length ; j++){
				        	switch (array[j]/10) {
							case 1:
								break;
								default:
									Exit +="\n\tEnd of program";
									System.exit(0);
								break;
							}			        	
				        }				       
						System.out.println("Maximum Grade = "+ max +"\t" +maxi);
						System.out.println("Minimum Grade = "+ min +"\t"+mini);
				        System.out.println("avg =" +avg);
			}
		}
