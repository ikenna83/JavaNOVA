// Odi-Rodrigue P. Ikenna-Odom
// CSC 185
// Spring 2010
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.JApplet;

public class Rings extends JApplet {

	
	private static final long serialVersionUID = 1L;

	public void paint(Graphics canvas){
		canvas.setColor(Color.blue);
		//canvas.setFont(getFont("Times-Bold", 5, 25));
		canvas.drawOval(100, 50, 200, 200);
		
		canvas.setColor(Color.black);
		//canvas.setFont(getFont("Arial", 12, 12));
		canvas.drawOval(310, 50, 200, 200);
		
		canvas.setColor(Color.red);
		//canvas.setFont(getFont("Arial", 12, 12));
		canvas.drawOval(520, 50, 200, 200);
		
		canvas.setColor(Color.yellow);
		//canvas.setFont(getFont("Arial", 12, 12));
		canvas.drawOval(200, 200, 200, 200);
		
		canvas.setColor(Color.green);
		//canvas.setFont(getFont("Arial", 12, 12));
		canvas.drawOval(420, 200, 200, 200);
		
	}

	private Font getFont(String string, int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}
}
