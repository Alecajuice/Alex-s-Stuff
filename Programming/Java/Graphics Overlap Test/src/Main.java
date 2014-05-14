import java.applet.*;
import java.awt.*;

public class Main extends Applet {
	
	public void init() {
		setSize(1920, 1080);
		setVisible(true);
		setBackground(Color.BLACK);
		for (int i = 0; i <= 1000; i++) {
			repaint();
			try {
				Thread.sleep(20);
			} catch (Exception e) {
				System.out.println("Error");
			}
		}
	}
	
	Image p1body = Toolkit.getDefaultToolkit().getImage("p1body.png");
	Image p1cannon = Toolkit.getDefaultToolkit().getImage("p1cannon.png");
	
	public void paint(Graphics screen) {
		Graphics2D g2d = (Graphics2D)screen;
		g2d.translate(960, 540);
		for (int i = 0; i <= 360; i++) {
			g2d.rotate(0.0174532925/5 * i); //Rotate image by 1/5 degree * i
			g2d.drawImage(p1body, 0, 0, 400, 400, this);
			g2d.rotate(-0.0174532925/5 * i); //Rotate image by -1/5 degree * i
			g2d.drawImage(p1cannon, 0, 0, 210, 390, this);
			repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				System.out.println("Error");
			}
		}
	}

}
