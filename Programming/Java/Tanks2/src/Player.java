import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

public class Player {
	double x, y;
	int angle, barrelAngle;
	
	public Player() {
		x = 0.0;
		y = 0.0;
		angle = 0;
		barrelAngle = 0;
	}
	int rFactor = 1;
	boolean translated = false;
	Image image1 = Toolkit.getDefaultToolkit().getImage("p1body.png");
	Image image2 = Toolkit.getDefaultToolkit().getImage("p1cannon.png");
	Image image3 = Toolkit.getDefaultToolkit().getImage("p2body.png");
	Image image4 = Toolkit.getDefaultToolkit().getImage("p2cannon.png");
	public void draw (Graphics screen, int playerNum) {
		Graphics2D g2d=(Graphics2D)screen; // Create a Java2D version of g.
		g2d.translate((int)x, (int)y);
        g2d.rotate(0.0174532925/5 * rFactor);
        if (playerNum == 1) {
        	g2d.drawImage(image1, 0, 0, 400, 400, null);
        	g2d.drawImage(image2, 93, 55, 210, 390, null);
        }
        if (playerNum == 2) {
        	g2d.drawImage(image3, 0, 0, 400, 400, null);
        	g2d.drawImage(image4, 93, 55, 210, 390, null);
        }
        g2d.rotate(-0.0174532925/5 * rFactor);
        g2d.translate(-(int)x, -(int)y);
        rFactor++;
        try {
        	Thread.sleep(1);
        } catch (InterruptedException e) {
        	System.out.println("Error");
        }
	}
}
