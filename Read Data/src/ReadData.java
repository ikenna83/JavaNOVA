// Odi-Rodrigue P. Ikenna-Odom
// CSC 201
// Spring 2010
import java.util.Scanner;
import java.io.*;

public class ReadData {

	
	public static void main (String[] args) throws Exception {
		//Create a File Scanner
		java.io.File file = new java.io.File("Score2.txt");

		//Create a Scanner for the file
		Scanner input = new Scanner (file);

		//Read Data from a file
		while (input.hasNext()){
			String firstName = input.next ();
			String mi = input.next ();
			String lastName = input.next ();
			int score = input.nextInt ();
			System.out.println(firstName + " " + mi + " " + lastName + " " + score);
		}
		System.out.println("Does the file exists" + file.exists ());
		System.out.println("The file has" + file.length() + "bytes");
		System.out.println("Can the file be read ?" + file.canRead ());
		System.out.println("Does the file written" + file.canWrite ());
		System.out.println("Is it indirectory " + file.isDirectory ());
		System.out.println("Is it a file ?" + file.isFile ());
		System.out.println("Is the file hidden ?" + file.isHidden());
		System.out.println("Last modified on " + new java.util.Date(file.lastModified ()));
		//close the file
		input.close ();
	}
}
