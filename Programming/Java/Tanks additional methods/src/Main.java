// Import the basic graphics classes.
import java.awt.*;

import javax.swing.*;
/**
 * Simple program that loads, rotates and displays an image.
 * Uses the file Duke_Blocks.gif, which should be in
 * the same directory.
 * 
 * @author MAG
 * @version 20Feb2009
 */

public class Main extends JPanel{
//Middle of cannon is 94 px down; dimensions are 210 by 390
    // Declare an Image object for us to use.
    Image image;
    
    // Create a constructor method
    public Main(){
       super();
       // Load an image to play with.
       image = Toolkit.getDefaultToolkit().getImage("p1body.png");
    }
  
    public void paint(Graphics g) {
         Graphics2D g2d=(Graphics2D)g; // Create a Java2D version of g.
         g2d.drawImage(image, 0, 0, 200, 200, this);
         for (int i = 1; i <= 10; i++) {
         g2d.translate(50, 50);
         g2d.rotate(0.0174532925);  // Rotate the image by 1 degree.
         repaint();
         try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Error");
		}
         }
    }

    public static void main(String arg[]){
       JFrame frame = new JFrame("Main");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(600,400);

       Main panel = new Main();
       frame.setContentPane(panel);  
       frame.setVisible(true);  
    }
}