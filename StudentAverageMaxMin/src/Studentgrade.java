// Odi-Rodrigue P. Ikenna-Odom
// CSC 201
// Spring 2010
		import java.util.Scanner;
		public class Studentgrade {
		
			public static void main(String[] args) {
				int num_of_student ;
	
				Scanner input = new Scanner(System.in);
				System.out.println("Enter the  number of Student :");
				num_of_student = input.nextInt();
		
	
				String []name = new String [num_of_student] ;
				int array[] = new int [num_of_student];
		
				String upAvg ="" ;
				String dwnAvg ="" ;
				String exellent = "Exellent :";
				String veryGgood ="Very Good :";
				String good="Good :";
				String pass ="Pass :";
				String fail = "Fail :";
				int sum=0;
				int avg;
				int min = array[0]=100;
				int max = array[0]=0;
				String maxi = null;
				String mini =null ;
	
	
	
				        for ( int j = 0; j< array.length; j++ )
				        {
				        	System.out.println("Enter Student Name :");
				        	name[j]=input.next();

				        	System.out.println("Enter Student Grade :");
				        	array[j]=input.nextInt();

				        	sum=sum+array[j];

				        	if (array[j] > max) 
							{
								max = array[j];
								maxi=name[j];
							}
		
							if (array[j] < min)
							{
								min = array[j];
								mini= name[j];
							}
		
				        }
				        avg= sum/array.length ;
				        for (int j=0 ; j<array.length ; j++)
				        {
				        	switch (array[j]/10)
							{
							case 100:
							case 9 :
								exellent += "\n"+ name[j] + "\t" +array[j]+"\n";
								break;
							case 8 :
								veryGgood += "\n" + name[j] + "\t" +array[j] +"\n";	
								break ;		
							case 7 :
								good += "\n" + name[j] + "\t" +array[j] +"\n";	
								break;
							case 6:
							case 5:
								pass += "\n" + name[j] + "\t" +array[j] +"\n";
								break;
								default:
									fail +="\n" + name[j] + "\t" +array[j] +"\n";
								break;
							}
		
				        	if(array[j]>avg)
				        	{
				        		upAvg += name[j] +"\t"+ array[j]+"\n";	
				        	}
				        	else if (array[j]<avg)
				        	{
				        		dwnAvg += name[j] +"\t"+ array[j]+"\n";	
		
				        	}
				        	//System.out.println("value=\t"+ array[j]);
				        }
	
				        System.out.println(" result = :");
						System.out.println(exellent +"\n"+ veryGgood +"\n"+ good +"\n"+ pass +"\n"+fail);
						System.out.println("Maximum Grade = "+ max +"\t" +maxi);
						System.out.println("Minimum Grade = "+ min +"\t"+mini);
	
				        System.out.println("avg =" +avg);
	
						System.out.println("ubove avg\n"+upAvg +"\n");
						System.out.println("under avg\n"+dwnAvg+"\n");
	
			}
		
		}