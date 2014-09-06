// Odi-Rodrigue P. Ikenna-Odom
// CSC 202
// Summer 2010
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class MyFrame4 extends JFrame {

	   public MyFrame4 () {
		   setLayout(new GridLayout(3,2,5,5));

		   add(new JLabel("First Name"));
		   add(new JTextField(10));
		   add(new JLabel("MI"));
		   add(new JTextField(1));
		   add(new JLabel("Last Name"));
		   add(new JTextField(10));

}

  public static void main (String [] args ) {

      MyFrame4  frame = new MyFrame4 () ;

      frame.setSize(500,100);
      frame.setTitle("MY First Frame");
      frame.setLocation(300,400);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      frame.setResizable(false);

      }
  }