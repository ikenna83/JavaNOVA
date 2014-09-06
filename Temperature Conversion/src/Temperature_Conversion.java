// Odi-Rodrigue P. Ikenna-Odom
// CSC 201
// Spring 2010
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Temperature_Conversion extends JFrame {

	private static final long serialVersionUID = 1L;
		JLabel jlbC  = new JLabel("celsius");
           JLabel jlbF  = new JLabel("Fahrenheit");
           JLabel jlbK  = new JLabel("Kelvin");

	       JLabel jlbl1 = new JLabel("Temperature_Conversion",JLabel.CENTER);

	       JTextField jtfC    = new JTextField(20);
	       JTextField jtfF    = new JTextField(20);
	       JTextField jtfK    = new JTextField(20);

	       JButton jbtC     = new JButton("celsius");
	       JButton jbtF     = new JButton("Fahrenheit");
	       JButton jbtK     = new JButton("Kelvin");
	       JButton jbtClear    = new JButton("Clear");
	       JButton jbtExit     = new JButton("Exit");

	      public Temperature_Conversion() {

			  JPanel p1 = new JPanel();
			  p1.setLayout(new GridLayout(3,2,5,5));
			  p1.setBackground(Color.GREEN);
			  p1.add(jlbC);
			  p1.add(jtfC);
			  p1.add(jlbF);
			  p1.add(jtfF);
			  p1.add(jlbK);
			  p1.add(jtfK);

			  JPanel p2 = new JPanel();
			  p2.setLayout(new FlowLayout());
			  p2.setBackground(Color.ORANGE);
			  p2.add(jbtC);
			  p2.add(jbtF);
			  p2.add(jbtK);
			  p2.add(jbtClear);
			  p2.add(jbtExit);

			  getContentPane().add(jlbl1, BorderLayout.NORTH);
			  getContentPane().add(p1, BorderLayout.CENTER);
			  getContentPane().add(p2, BorderLayout.SOUTH);

	      }





     public static void main(String [] args ) {

        Temperature_Conversion frame = new Temperature_Conversion();
        frame.setTitle("Temperature Conversion");
        frame.setLocation(300,300);
        frame.setSize(500,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

