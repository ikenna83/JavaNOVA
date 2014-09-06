// Odi-Rodrigue P. Ikenna-Odom
// CSC 202
// Summer 2010
import javax.swing.*;
import java.awt.*;

public class MyFrame6 extends JFrame {

	   public MyFrame6 () {

		   JPanel p1 = new JPanel();
		   p1.setLayout(new GridLayout(4, 3));

		   for ( int index = 1; index <= 9; index ++) {
			   p1.add( new JButton(" " + index));
		   }

		   p1.add ( new JButton(" " + 0));
		   p1.add ( new JButton("Start"));
		   p1.add ( new JButton("Stop"));

		   JPanel p2 = new JPanel ();
		   p2.setLayout(new BorderLayout());
		   p2.add(new JTextField("Time to be displayed here"), BorderLayout.NORTH);
		   p2.add(p1, BorderLayout.CENTER);

		   add(p2, BorderLayout.EAST);
		   add(new JButton("Food to be placed here"), BorderLayout.CENTER);
}

  public static void main (String [] args ) {

      MyFrame6  frame = new MyFrame6 () ;

      frame.setSize(500,400);
      frame.setTitle("MY First Frame");
      frame.setLocation(300,400);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      frame.setResizable(false);

      }
  }