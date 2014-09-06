// Odi-Rodrigue P. Ikenna-Odom
// CSC 201
// Spring 2010
import java.io.*;

public class TestDataStream {

	public static void main(String[] args) throws IOException {

		DataOutputStream out = new DataOutputStream(new FileOutputStream("temp.out"));

		//write student test scores to the file
		out.writeUTF("john");
		out.writeDouble(85.5);
		out.writeUTF("Jim");
		out.writeDouble(185.5);
		out.writeUTF("George");
		out.writeDouble(105.25);

		//close output stream
		out.close();


		//create an input stream for file temp.out
		DataInputStream in = new DataInputStream(new FileInputStream("temps.out"));

		System.out.println(in.readUTF() + " " + in.readDouble ());
		System.out.println(in.readUTF() + " " + in.readDouble ());
		System.out.println(in.readUTF() + " " + in.readDouble ());

	}
}