// Odi-Rodrigue P. Ikenna-Odom
// CSC 202
// Summer 2010
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.FlowLayout;


public class MyFrame3 extends JFrame {

	   public MyFrame3 () {
		   setLayout(new FlowLayout(FlowLayout.LEFT, 10 ,20));

		   add(new JLabel("First Name"));
		   add(new JTextField(10));
		   add(JButton("Clear"));
		   add(new JLabel("MI"));
		   add(new JTextField(1));
		   add(new JLabel("Last Name"));
		   add(new JTextField(10));

}

  public static void main (String [] args ) {

      MyFrame3  frame = new MyFrame3 () ;

      frame.setSize(600,100);
      frame.setTitle("MY First Frame");
      frame.setLocation(300,400);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      frame.setResizable(false);

      }
  }