// Odi-Rodrigue P. Ikenna-Odom
// CSC 201
// Spring 2010

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;

public class PalindromeValidator extends JFrame{
	
//Labeling
	JLabel jlbName = new JLabel("Palindrome Validator" , JLabel.CENTER);
	JLabel jlbInput = new JLabel("Enter Palindrome");
	JLabel jlbValidate = new JLabel("Validate");
	
//Text Fields
	JTextField jtfPalinstr = new JTextField (100);
	
//Buttons
	JButton jbtnVld = new JButton ("Validate");
	JButton jbtnClr = new JButton ("Clear");
	JButton jbtnExit = new JButton ("Exit");
	
	public PalindromeValidator () {
	
		JPanel p1 = new JPanel ();
//Frame and its layouts
		p1.setLayout(new GridLayout (2, 2, 5, 5));
		p1.add(jlbName);
		p1.add(jtfPalinstr);
		p1.add(jlbValidate);

//this is where you'll find Validate, Clear and Exit buttons.
		JPanel p2 = new JPanel();
		
		p2.setLayout (new GridLayout (1, 3, 5, 5));
		p2.add(jbtnVld);
		p2.add(jbtnClr);
		p2.add(jbtnExit);
		
//More Frames and layouts
		getContentPane() .add(jlbName,BorderLayout.NORTH);
		getContentPane() .add(p1,BorderLayout.CENTER);
		getContentPane() .add(p2,BorderLayout.SOUTH);
	
//Action listeners for the buttons
		jbtnVld.addActionListener(new validez());
	    jbtnClr.addActionListener(new clearForm());
	    jbtnExit.addActionListener(new exitApp());
	    	
		
	} //The end of PalindromeValidator
	
	public static void main (String[] args) {
		PalindromeValidator frame = new PalindromeValidator ();
		frame.setTitle("Palindrome Validator");
		frame.setLocation(300, 300);
		frame.setSize(300, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);	
	}// The end of the Main
	
//Action listeners for PalindromeValidator
	class validez implements ActionListener {
		public void actionPerformed(ActionEvent e){
			
			//recollect the string from the text box
			String s = jtfPalinstr.getText();
			if (isPalindrome(s)){
				//Then it's a Palindrome
				jlbValidate.setText("This Is a Palindrome");
			}
			else{
				// It's Not a Palindrome
				jlbValidate.setText("This Is Not a Palindrome");
			}
		}
		
	}
//Action Listener for clear
	class clearForm implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			jlbValidate.setText("Validate");
			jtfPalinstr.setText("");
			
		}
	}
//Action Listener for Exit
	class exitApp implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
			
		}
	}
//These are the conditions/formula
	public static boolean isPalindrome (String ss) {
		ss = ss.trim();//trims gap in between the beginning and the end
		
//the index of first and last characters are the strings
		int low = 0; 
		int high = ss.length() - 1;
		
		while(low < high) {
			while (!Character.isLetterOrDigit(ss.charAt(low))) {
				low ++;
			}
			while (!Character.isLetterOrDigit(ss.charAt(high))) {
				high--;
			}
			if (Character.toUpperCase(ss.charAt(low)) !=
				Character.toUpperCase(ss.charAt(high)))
				return false;
			low++;
			high--;
		}
		return true;
	}//Conditions/formulas end here
	
}//This ends the class
