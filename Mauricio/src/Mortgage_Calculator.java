
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Mortgage_Calculator extends JFrame implements ActionListener {

	
	JLabel Jlbl1 = new JLabel("This Program calculates Mortgage monthly payment ",JLabel.CENTER);//change this statement her(mauricio)
	
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
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		}

public Mortgage_Calculator() {
	JPanel p1 = new JPanel();
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
	
	
	JPanel p2 =new JPanel();
	p2.setLayout(new GridLayout());
	p2.add(Jbtcalcpay);
	p2.add(JbtExit);
	p2.add(JbtClr);

getContentPane().add(Jlbl1,BorderLayout.NORTH);
getContentPane().add(p1,BorderLayout.CENTER);
getContentPane().add(p2,BorderLayout.SOUTH);


JtftermPrinc.setEditable(false);
JtfperiodicPay.setEditable(false);
JtftermInt.setEditable(false);
JtftotalInt.setEditable(false);
Jbtcalcpay.addActionListener(this);
JbtExit.addActionListener(this);
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



public void calculate()
{



double num1 = Double.parseDouble(Jtfprinc.getText().trim());

double num2 = Double.parseDouble(Jtfinterst.getText().trim());

double num3 = Double.parseDouble(Jtfterm.getText().trim());

double i = (num2/100)/12;

double it = i*12*30;

double n = 12 * num3;

double p = num1;

double M = p* (( i*Math.pow((1 + i),n) ) / ( Math.pow((1 +i),n) - 1));

double term_principal = M-(i*M);

JtftermInt.setText(Double.toString(i));

JtftotalInt.setText(Double.toString(it));

JtfperiodicPay.setText(Double.toString(M));

JtftermPrinc.setText(Double.toString(term_principal));



}

}

