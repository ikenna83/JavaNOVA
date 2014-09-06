// Odi-Rodrigue P. Ikenna-Odom
// CSC 201
// Spring 2010

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//class Mortgage_Calculator
public class Mortgage_Calculator extends JFrame implements ActionListener {

	// putting up labels
	JLabel Jlbl1 = new JLabel("This Program calculates Mortgage monthly payment ",JLabel.CENTER);
	
	JLabel Jlbprinc = new JLabel("Principal");
	JLabel Jlbterm = new JLabel("Term (Yrs)");
	JLabel Jlbinterst = new JLabel("Interst Rate");
	
	JLabel JlbtermPrinc = new JLabel("Term Principal");
	JLabel JlbtermInt = new JLabel("Term Interst ");
	JLabel JlbtotalInt = new JLabel("Total Interst ");
	JLabel JlbperiodicPay = new JLabel("Periodic Payment");
	
	
	JTextField Jtfprinc = new JTextField(5); 
	JTextField Jtfterm = new JTextField(5);
	JTextField Jtfinterst = new JTextField(5);
	
	
	JTextField JtftermPrinc = new JTextField(5);
	JTextField JtftermInt= new JTextField(5);
	JTextField JtftotalInt= new JTextField(5);
	JTextField JtfperiodicPay = new JTextField(5);
	
	
	JButton Jbtcalcpay = new JButton("Calculate Payment");
	JButton JbtExit = new JButton("Exit");
	JButton JbtClr = new JButton("Clr");
	
	public static void main(String [] args) {
		
		
		Mortgage_Calculator frame = new Mortgage_Calculator();
		frame.setTitle("MORTGAGE CALCULATOR");
		frame.setLocation(200,100);
		frame.pack();
		
		//setting up the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		}





// setting up the panel1 and background color
public Mortgage_Calculator() {
	JPanel p1 = new JPanel();
	p1.setBackground(Color.pink);
	p1.setLayout(new GridLayout(8,6,4,2));
	p1.add(Jlbprinc);
	p1.add(Jtfprinc);
	p1.add(Jlbinterst);
	p1.add(Jtfinterst);
	p1.add(Jlbterm);
	p1.add(Jtfterm);
	p1.add(JlbtermInt);
	p1.add(JtftermInt);
	p1.add(JlbtotalInt );
	p1.add(JtftotalInt);
	p1.add(JlbperiodicPay);
	p1.add(JtfperiodicPay);
	p1.add(JlbtermPrinc);
	p1.add(JtftermPrinc);
	
	//Panel2, its layout and background color.
	JPanel p2 =new JPanel();
	p2.setBackground(Color.cyan);
	p2.setLayout(new GridLayout());
	p2.add(Jbtcalcpay);
	p2.add(JbtExit);
	p2.add(JbtClr);



getContentPane().add(Jlbl1,BorderLayout.NORTH);
getContentPane().add(p1,BorderLayout.CENTER);
getContentPane().add(p2,BorderLayout.SOUTH);




//can't edit the principal
JtftermPrinc.setEditable(false);
//can't edit the monthly pay
JtfperiodicPay.setEditable(false);
//can't edit interest
JtftermInt.setEditable(false);
//can't edit total interest
JtftotalInt.setEditable(false);
//this to calculate the input date
Jbtcalcpay.addActionListener(this);
//to exit the application
JbtExit.addActionListener(this);
//to clear data
JbtClr.addActionListener(this);



}

public void actionPerformed(ActionEvent e) {




if(e.getSource() == JbtExit)System.exit(0);

else

if (e.getSource() == JbtClr) {

Jtfprinc.setText("");

Jtfinterst.setText("");

Jtfterm.setText("");

JtftermInt.setText("");

JtftermPrinc.setText("");

JtftotalInt.setText("");


JtfperiodicPay.setText("");


}

else

if(e.getSource() == Jbtcalcpay)
calculate();


}

//calculate the monthly payment and the interest will be paid

public void calculate()
{



double num1 = Double.parseDouble(Jtfprinc.getText().trim());

double num2 = Double.parseDouble(Jtfinterst.getText().trim());

double num3 = Double.parseDouble(Jtfterm.getText().trim());



//The compound interest Formulas (i) standing for interest.

double i = (num2/100)/12;

double it = i*12*30;


double n = 12 * num3;


double p = num1;


double M = p* (( i*Math.pow((1 + i),n) ) / ( Math.pow((1 +i),n) - 1));

double term_principal = M-(i*M);

JtftermInt.setText(Double.toString(i));

JtftotalInt.setText(Double.toString(it));

JtfperiodicPay.setText(Double.toString(M));

// M Monthly payments

JtftermPrinc.setText(Double.toString(term_principal));





}

}

