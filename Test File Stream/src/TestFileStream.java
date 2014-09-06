// Odi-Rodrigue P. Ikenna-Odom
// CSC 201
// Spring 2010
import java.io.*;

public class TestFileStream {

public TestFileStream () {
}

public static void main (String [] args) throws IOException {

	FileOutputStream output = new FileOutputStream("temp.dat");

	for ( int i = 1; i <= 10 ; i++)
	  output.write(i);
 //close the output file
	output.close();
// Create an input stream for the file
FileInputStream input = new FileInputStream("temp.dat");

//Read values from the file
int value;
while (( value = input.read()) != -1){
	System.out.print(value + " ");

}

//close the input stream
input.close();

}
}
