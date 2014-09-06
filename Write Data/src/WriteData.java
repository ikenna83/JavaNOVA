// Odi-Rodrigue P. Ikenna-Odom
// CSC 201
// Spring 2010
public class WriteData {
	public WriteData () {
	}
	public static void main(String[] args) throws Exception {
		java.io.File file = new java.io.File("Score2.txt");

		if ( file.exists()) {
			System.out.println(" file already exists ");
			System.exit (0);

	}
	//Create a file
	java.io.PrintWriter output = new java.io.PrintWriter(file);

	// Write formatted output to the file
	output.print(" John T Smith ");
	output.println(90);
	output.print(" Eric K Jones ");
	output.println(85);

	//close file
	output.close();

}
}