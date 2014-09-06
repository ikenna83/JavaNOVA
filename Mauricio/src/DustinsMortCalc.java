
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.text.*;
import java.util.*;
import java.lang.*;
import javax.swing.border.*;

// Create MortgageCalculator class
public class DustinsMortCalc extends JFrame implements ActionListener
{



// Radio Button Selection
JPanel rowOne = new JPanel();
JRadioButton rbOne = new JRadioButton("7 Years/5.35%",false);
JRadioButton rbTwo = new JRadioButton("15 Years/5.5%",false);
JRadioButton rbThree = new JRadioButton("30 Years/5.75%",true);

// Text Amount for Mortgage
JPanel rowTwo = new JPanel();
JLabel mortgageLabel = new JLabel("Mortgage Amount $", JLabel.LEFT);
JTextField mortgageText = new JTextField(10);
JLabel termLabel = new JLabel("Mortgage Term (Years)", JLabel.LEFT);
JTextField termText = new JTextField(3);
JLabel intRateLabel = new JLabel("Interest Rate (%)", JLabel.LEFT);
JTextField intRateText = new JTextField(5);
JLabel mPaymentLabel = new JLabel("Monthly Payment $", JLabel.LEFT);
JTextField mPaymentText = new JTextField(10);

// Create buttons to calculate payment, amortizaton, and clear fields
JPanel rowThree = new JPanel();
JButton calculateButton = new JButton("CALCULATE");
JButton clearButton = new JButton("CLEAR");
JButton exitButton = new JButton("EXIT");

// Create Label for Text Box
JPanel rowFour = new JPanel();
JLabel paymentLabel = new JLabel ("Payment #");
JLabel balLabel = new JLabel (" Balance");
JLabel ytdPrincLabel = new JLabel (" Principal");
JLabel ytdIntLabel = new JLabel (" Interest");

// Display area
JPanel rowFive = new JPanel(new FlowLayout());
JTextArea textArea = new JTextArea(10, 31);
JScrollPane scroll = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

public DustinsMortCalc(){
super("My Simple Mortgage Calculator");
setSize(400, 485);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Container pane = getContentPane();
JScrollPane scroll = new JScrollPane (textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
FlowLayout layout = new FlowLayout (FlowLayout.LEFT);
pane.setLayout(layout);

// Menu Selection for Term & Rate
JMenuItem mOne = new JMenuItem ("7 Years/5.35%");
JMenuItem mTwo = new JMenuItem ("15 Years/5.5%");
JMenuItem mThree = new JMenuItem ("30 Years/5.75%");
JMenu menu = new JMenu ("SELECT TERM & RATE");
menu.add(mOne);
menu.addSeparator();
menu.add(mTwo);
menu.addSeparator();
menu.add(mThree);

JMenuBar mBar = new JMenuBar();
mBar.add(menu);
setJMenuBar(mBar);

// Listeners
mOne.addActionListener(this);
mTwo.addActionListener(this);
mThree.addActionListener(this);

// Add to the screen
FlowLayout layout1 = new FlowLayout();
rowOne.setLayout(layout1);

// Add Radio Button Group
ButtonGroup btnGrp = new ButtonGroup();
btnGrp.add(rbOne);
btnGrp.add(rbTwo);
btnGrp.add(rbThree);
rowOne.add(rbOne);
rowOne.add(rbTwo);
rowOne.add(rbThree);
pane.add(rowOne);

// Create a border around the radio buttons
Border titledRadioBorder =
BorderFactory.createTitledBorder("Make your selections");
rowOne.setBorder(titledRadioBorder);

// Listeners
rbOne.addActionListener(this);
rbTwo.addActionListener(this);
rbThree.addActionListener(this);

// Add Labels & Text Boxes
GridLayout layout2 = new GridLayout (4, 1);
rowTwo.setLayout(layout2);
rowTwo.add(mortgageLabel);
rowTwo.add(mortgageText);
mortgageText.setText("200000");
rowTwo.add(termLabel);
rowTwo.add(termText);
termText.setText("30");
rowTwo.add(intRateLabel);
rowTwo.add(intRateText);
intRateText.setText("5.75");
rowTwo.add(mPaymentLabel);
rowTwo.add(mPaymentText);
mPaymentText.setEnabled(false);
pane.add(rowTwo);

// Add Buttons
FlowLayout layout3 = new FlowLayout (FlowLayout.CENTER, 10, 10);
rowThree.setLayout (layout3);
rowThree.add(calculateButton);
calculateButton.setBackground(Color.green);
rowThree.add(clearButton);
clearButton.setBackground(Color.white);
rowThree.add(exitButton);
exitButton.setBackground(Color.red);
pane.add(rowThree);

// Listeners
calculateButton.addActionListener(this);
clearButton.addActionListener(this);
exitButton.addActionListener(this);

// Add Text Box Label
FlowLayout layout4 = new FlowLayout (FlowLayout.LEFT, 10, 10);
rowFour.setLayout (layout4);
rowFour.add(paymentLabel);
rowFour.add(balLabel);
rowFour.add(ytdPrincLabel);
rowFour.add(ytdIntLabel);
pane.add(rowFour);

// Add Text Box
FlowLayout layout5 = new FlowLayout (FlowLayout.CENTER, 10, 10);
rowFive.setLayout(layout5);
rowFive.add(scroll);
pane.add(rowFive);

setContentPane(pane);
setVisible(true);
}

public void actionPerformed (ActionEvent event)
{
Object command = event.getSource();
if (command == exitButton){
System.exit(0);
}
}

public static void main(String[] args)
{
DustinsMortCalc frame = new DustinsMortCalc();
}
}