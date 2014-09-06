// Odi-Rodrigue P. Ikenna-Odom
// CSC 202
// Summer 2010
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.BorderLayout;

public class MyFrame5 extends JFrame {

	   public MyFrame5 () {
		   setLayout(new BorderLayout(5,10));

		   add(new JButton("East"), BorderLayout.EAST);
		   add(new JButton("South"), BorderLayout.SOUTH);
		   add(new JButton("West"), BorderLayout.WEST);
		   add(new JButton("North"), BorderLayout.NORTH);
		   add(new JButton("Center"), BorderLayout.CENTER);


}

  public static void main (String [] args ) {

      MyFrame5  frame = new MyFrame5 () ;

      frame.setSize(500,400);
      frame.setTitle("MY First Frame");
      frame.setLocation(300,400);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      frame.setResizable(false);

      }
  }