// Odi-Rodrigue P. Ikenna-Odom
// CSC 201
//Spring 2010

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator_One extends JFrame
		implements ActionListener {

	JLabel jlbNum1 = new JLabel("Num1");
	JLabel jlbNum2 = new JLabel("Num2");
	JLabel jlbResult = new JLabel("Result");

	JTextField jtfNum1 = new JTextField(10);
	JTextField jtfNum2 = new JTextField(10);
	JTextField jtfResult = new JTextField(10);

	JButton jbtAdd = new JButton ("Add");
	JButton jbtSub = new JButton ("Subtract");
	JButton jbtMult = new JButton ("Multiply");
	JButton jbtDiv = new JButton ("Divide");
	JButton jbtRem = new JButton ("Remainder");
	JButton jbtClr = new JButton ("Clear");
	JButton jbtExit = new JButton ("Exit");

	public Calculator_One() {

		JPanel p1 = new JPanel();
		p1.setBackground (Color.pink);
		p1.setLayout( new FlowLayout());
		p1.add(jlbNum1);
		p1.add(jtfNum1);
		p1.add(jlbNum2);
		p1.add(jtfNum2);
		p1.add(jlbResult);
		p1.add(jtfResult);

		JPanel p2 = new JPanel();
		p2.setBackground (Color.CYAN);
		p2.setLayout(new FlowLayout());
		p2.add(jbtAdd);
		p2.add(jbtSub);
		p2.add(jbtMult);
		p2.add(jbtDiv);
		p2.add(jbtRem);
		p2.add(jbtClr);
		p2.add(jbtExit);

		jtfNum1.setHorizontalAlignment(JTextField.RIGHT);
		jtfNum2.setHorizontalAlignment(JTextField.RIGHT);
		jtfResult.setEditable(false);


		jbtAdd.addActionListener(this);
		jbtSub.addActionListener(this);
		jbtMult.addActionListener(this);
		jbtDiv.addActionListener(this);
		jbtRem.addActionListener(this);
		jbtClr.addActionListener(this);
		jbtExit.addActionListener(this);


	getContentPane().add(p1, BorderLayout.NORTH);
	getContentPane().add(p2, BorderLayout.SOUTH);

}
	public static void main(String [] args){
		Calculator_One frame = new Calculator_One();
		frame.setTitle("Calculator Machine");
		frame.setSize(500,150);
		frame.pack();
		frame.setLocation(300,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		}

		public void actionPerformed(ActionEvent e){
			if ( e.getSource() == jbtExit)
				System.exit(0);
				else
				if ( e.getSource() == jbtClr){
					jtfNum1.setText("");
					jtfNum2.setText("");
					jtfResult.setText("");


			} else
				if ( e.getSource() == jbtAdd)
					calculate('+');
				else
					if ( e.getSource()==jbtSub)
						calculate('-');
					else
						if ( e.getSource()==jbtRem)
							calculate('%');
						else
							if (e.getSource()==jbtMult)
								calculate('*');
							else
								if (e.getSource()==jbtDiv)
									calculate('/');
}

public void calculate(char operator){
	double num1= Double.parseDouble(jtfNum1.getText().trim());
	double num2= Double.parseDouble(jtfNum2.getText().trim());
	double result= 0;

	switch( operator ) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		case '%':
			result = num1 % num2;
			break;
}
jtfResult.setText(Double.toString(result));


}
	}
