// Odi-Rodrigue P. Ikenna-Odom
// CSC 185
// Spring 2010
import javax.swing.JApplet;

import java.awt.Graphics;

public class Circles extends JApplet {
	public void paint (Graphics canvas) {
		
		canvas.drawOval(150, 150, 100, 100);
		canvas.fillOval(175, 175, 50, 50);
		canvas.drawArc(50, 150, 100, 100, 270, 180);
		canvas.drawArc(250, 150, 100, 100, 90, 180);
		canvas.drawArc(150, 50, 100, 100, 180, 180);
		canvas.drawArc(150, 250, 100, 100, 0, 180);
	}
}