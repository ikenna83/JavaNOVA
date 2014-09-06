// Odi-Rodrigue P. Ikenna-Odom
// CSC 201
// Spring 2010
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Temperature extends JFrame {
   private JRadioButton jrbC2F, jrbC2K, jrbF2C, jrbF2K;
   private JTextField jtfTemp, jtfResult, jtfDescription, jtfInstructions;

   private JButton jbtCalc;
   private double value, result;
   private String conversionUnit;

   public static void main(String [] args ){
	   Temperature frame = new Temperature();

	   frame.setSize(435, 250);
	   frame.setLocationRelativeTo( null );
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   frame.setTitle("Temperature Converter");
	   frame.setVisible(true);
  }

  public Temperature() {
	   JPanel jpRadionButton = new JPanel();
	   jpRadionButton.setLayout(new GridLayout(9,1));
	   jpRadionButton.setBackground(Color.YELLOW);

	jpRadionButton.add(jtfDescription = new
	  JTextField("This converts temperature between Cesius,Fahrenheit and Kelvin"));
	jpRadionButton.add(jtfInstructions = new
	 JTextField("Enter temperature in celsuis below and select conversion."));
	jpRadionButton.add(jtfTemp = new JTextField());
	jpRadionButton.add(jrbC2F = new JRadioButton("C  to F "));
	jpRadionButton.add(jrbC2K = new JRadioButton("C  to K "));
	jpRadionButton.add(jrbF2C = new JRadioButton("F  to C "));
	jpRadionButton.add(jrbF2K = new JRadioButton("F  to K "));

	jpRadionButton.add(jbtCalc = new JButton("Conver Temperature"));
	jpRadionButton.add(jtfResult = new JTextField());

	jtfResult.setEditable(false);
	jtfInstructions.setEditable(false);
	jtfDescription.setEditable(false);
	jtfInstructions.setBackground(Color.GREEN);
	jtfDescription.setBackground(Color.ORANGE);

	add(jpRadionButton, BorderLayout.WEST);

	ButtonGroup group = new ButtonGroup();
	group.add( jrbC2F );
	group.add( jrbC2K );
	group.add( jrbF2C );
	group.add( jrbF2K );

	jrbC2F.setMnemonic('F');
	jrbC2K.setMnemonic('K');
	jrbF2C.setMnemonic('C');
	jrbF2K.setMnemonic('E');

	jrbC2F.setSelected( true );
	conversionUnit = "Farenheit";

	jrbC2F.addActionListener( new ActionListener() {
      public void actionPerformed( ActionEvent e ) {
	   jtfInstructions.setText
	        ("Enter temperature in Celsius below and select conversion.");
	   conversionUnit = "Farenheit";
   }
 });
 jrbC2K.addActionListener( new ActionListener() {
        public void actionPerformed( ActionEvent e ) {
  	   jtfInstructions.setText
  	        ("Enter temperature in Celsius below and select conversion.");
  	   conversionUnit = "Kelvin";
     }
 });
 jrbF2C.addActionListener( new ActionListener() {
    public void actionPerformed( ActionEvent e ) {
 	   jtfInstructions.setText
 	        ("Enter temperature in Fahrenheit below and select conversion.");
 	   conversionUnit = "Celsius";
    }
 });
 jrbF2K.addActionListener( new ActionListener() {
      public void actionPerformed( ActionEvent e ) {
	   jtfInstructions.setText
	        ("Enter temperature in fahrenheit below and select conversion.");
	   conversionUnit = "Kelvin";
   }
 });

jbtCalc.addActionListener( new ActionListener() {
	  public void actionPerformed( ActionEvent e){
		try{
			String input = jtfTemp.getText();
			value = Double.parseDouble(input);
			if ( jrbC2F.isSelected()){
				 System.out.println("  ");
				 result = (value * 1.8) + 32;
	     }else
	       if ( jrbC2K.isSelected()){
			   result = value + 273;
	       }else
	         if (jrbF2C.isSelected()){
				result = (value - 32 ) * 5.0 /9;
		     }else
		      if ( jrbF2K.isSelected()){
				  result = ((value - 32) * 5.0 / 9) + 273;
		      }
	   jtfResult.setText("Converted temperature is " + result +
	     "  degrees " + conversionUnit + " . ");
       }
       catch( Exception ex ) {
		   System.out.println(ex.getMessage());
	  }
   }
});
}
}
