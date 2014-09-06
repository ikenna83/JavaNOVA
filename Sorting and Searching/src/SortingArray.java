// Odi-Rodrigue P. Ikenna-Odom
// CSC 202
// Summer 2010

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.util.*;
import java.io.*;

public class SortingArray  extends JFrame implements ActionListener {
	
	DecimalFormat twodecimals = new DecimalFormat("0.00");
	
	//String S1 = "12 15 20 25 12 45 67 89 87 90";
	JLabel jlbLabel = new JLabel("Array Sorting/Searching",JTextField.CENTER);
	
	JLabel jlbL1 = new JLabel("The Input numbers are: ", JTextField.CENTER);
	JLabel jlbL2 = new JLabel("The Sorted numbers are: ", JTextField.CENTER);
	JLabel jlbL3 = new JLabel("The Search number: ", JTextField.CENTER);
	
	JTextField jtfL1 = new JTextField(15);
	JTextField jtfL2 = new JTextField(15);
	JTextField jtfL3 = new JTextField(15);
	
	JButton jbtSubmit = new JButton("Submit");
	JButton jbtSort = new JButton("Sort");
	JButton jbtSearch = new JButton("Search");
	JButton jbtExit = new JButton("Exit");
	JButton jbtClr = new JButton("Clear");
	
	Font f1 = new Font("Arial", Font.BOLD,18);
	Font f2 = new Font("Times new Roman", Font.BOLD,16);
	
public SortingArray () {
	
	JPanel p1 = new JPanel ();
	p1.setLayout(new GridLayout(3,2,5,10));
	p1.setBackground(Color.ORANGE);
	p1.add(jlbL1);
	p1.add(jtfL1);
	p1.add(jlbL2);
	p1.add(jtfL2);
	p1.add(jlbL3);
	p1.add(jtfL3);
	
	JPanel p2 = new JPanel ();
	p2.setLayout(new FlowLayout());
	p2.setBackground(Color.cyan);
	p2.add(jbtSubmit);
	p2.add(jbtSort);
	p2.add(jbtSearch);
	p2.add(jbtExit);
	p2.add(jbtClr);
	
	jlbLabel.setFont(f1);
	jlbL1.setFont(f2);
	jlbL2.setFont(f2);
	jlbL3.setFont(f2);
	
	getContentPane().add(jlbLabel,BorderLayout.NORTH);
	getContentPane().add(p1,BorderLayout.CENTER);
	getContentPane().add(p2,BorderLayout.SOUTH);
	
	jbtSubmit.addActionListener(this);
	jbtExit.addActionListener(this);
	jbtSort.addActionListener(this);
	//jbtSort.setEditable(false);
	jbtSearch.addActionListener(this);
	jbtClr.addActionListener(this);
	
	
	
}
public static void main(String [] args) throws Exception {
	
	SortingArray frame = new SortingArray();
	
	frame.setTitle("Project #1");
	frame.setLocation(300,200);
	frame.pack();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
}



public void actionPerformed(ActionEvent e) {
	if(e.getSource() == jbtSubmit) {
		
		
	}
	
}

}
