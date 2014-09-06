// Odi-Rodrigue P. Ikenna-Odom
// CSC 201
// Spring 2010
import javax.swing.*;
import java.awt.*;

public class TestPanels extends JFrame {

		
	private static final long serialVersionUID = -8369371722629652126L;

		public TestPanels() {
			JPanel pl = new JPanel ();
			pl.setBackground (Color.CYAN);
			pl.setLayout(new GridLayout(4,3));

			for( int index = 1; index <=9; index ++) {
				pl.add(new JButton(" " + index));

		}
		pl.add(new JButton(" " + 0));
		pl.add(new JButton("start"));
		pl.add(new JButton("stop"));

		JPanel p2 = new JPanel();
		p2.setBackground (Color.red);
		p2.setLayout(new BorderLayout());
		p2.add(new JTextField("Time to be displayed here"),
			     BorderLayout.NORTH);
	    p2.add(pl, BorderLayout.CENTER);

	    add(p2, BorderLayout.EAST);
	    add(new JButton("Food to be placed here"),
	            BorderLayout.CENTER);



}

	public static void main(String [] args){

		TestPanels frame = new TestPanels();


		frame.setTitle("My First Frame");
		frame.setSize(300, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible( true );
	}
}