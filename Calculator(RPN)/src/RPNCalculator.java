// Odi-Rodrigue P. Ikenna-Odom
// CSC 202
// Summer 2010

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RPNCalculator extends JFrame //implements ActionListener 
{
	JButton jbtclear = new JButton("Clear");
	JButton jbtexit = new JButton("Exit");
	JButton jbtevaluate = new JButton("Evaluate RPN");
	JButton jbtconvertrpn = new JButton("Convert RPN");
	
	JTextField jtfinfix = new JTextField();
	JTextField jtfpostfix = new JTextField();
	JTextField jtfresult = new JTextField();
	
	JLabel jlbinfix = new JLabel("Infix Expression: ",
		JLabel.CENTER);
	JLabel jlbpostfix = new JLabel("Postfix Expression: ",
		JLabel.CENTER);
	JLabel jlbresult = new JLabel("Result: ",
		JLabel.CENTER);
	JLabel jlbtitle = new JLabel("RPN Converter",
		JLabel.CENTER);
	
	public RPNCalculator()
	{
		JPanel p1 = new JPanel();
		p1.setBackground(Color.BLUE);
		p1.setLayout(new FlowLayout());
		p1.add(jbtevaluate);
		p1.add(jbtconvertrpn);
		p1.add(jbtclear);
		p1.add(jbtexit);
		
		JPanel p2 = new JPanel();
		p2.setBackground(Color.GREEN);
		p2.setLayout(new GridLayout(3, 2));
		p2.add(jlbinfix);
		p2.add(jtfinfix);
		p2.add(jlbpostfix);
		p2.add(jtfpostfix);
		p2.add(jlbresult);
		p2.add(jtfresult);
		
		jtfinfix.setHorizontalAlignment(JTextField.RIGHT);
		jtfpostfix.setHorizontalAlignment(JTextField.RIGHT);
		jtfresult.setHorizontalAlignment(JTextField.RIGHT);
		
		jlbtitle.setFont(new Font("Dialog", 1, 20));
		
		//jbtevaluate.addActionListener(this);
		//jbtconvertrpn.addActionListener(this);
		//jbtclear.addActionListener(this);
		//jbtexit.addActionListener(this);
		
		getContentPane().add(jlbtitle, BorderLayout.NORTH);
		getContentPane().add(p2, BorderLayout.CENTER);
		getContentPane().add(p1, BorderLayout.SOUTH);
	}
	
	public static void main(String[] args)
	{
		RPNCalculator frame = new RPNCalculator();
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("RPN Calculator");
		frame.setLocation(200, 200);
		frame.setVisible(true);
	}
	
	
	
}