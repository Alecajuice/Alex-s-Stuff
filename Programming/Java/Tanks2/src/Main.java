import java.applet.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Main extends Applet implements KeyListener {
	private static final long serialVersionUID = 1L;
	static Player player1 = new Player();
	static Player player2 = new Player();
	int width, height;
	//Applet initiation
	public void init() {
		addKeyListener(this);
		setSize(1920, 1080);
		setVisible(true);
		width = getSize().width;
		height = getSize().height;
	    setBackground(Color.black);
	    player1.x = 960;
	    player1.y = 540;
	    player2.x = 500;
	    player2.y = 500;
	}
	//Main method
	public static void main(String[] args) {
		
	}
	//Keyboard Input
	public void keyPressed(KeyEvent e) {
		char c = e.getKeyChar();
		int code = e.getKeyCode();
		int location = e.getKeyLocation();
		switch(c) {
		case 119:
			move(player1, 0);
			System.out.println("p1 forwards");
			break;
		case 115:
			move(player1, 1);
			System.out.println("p1 backwards");
			break;
		case 97:
			move(player1, 2);
			System.out.println("p1 left");
			break;
		case 100:
			move(player1, 3);
			System.out.println("p1 right");
			break;
		case 113:
			move(player1, 4);
			System.out.println("p1 barrel left");
			break;
		case 101:
			move(player1, 5);
			System.out.println("p1 barrel right");
			break;
		case 105:
			move(player2, 0);
			System.out.println("p2 forwards");
			break;
		case 107:
			move(player2, 1);
			System.out.println("p2 backwards");
			break;
		case 106:
			move(player2, 2);
			System.out.println("p2 left");
			break;
		case 108:
			move(player2, 3);
			System.out.println("p1 right");
			break;
		case 117:
			move(player2, 4);
			System.out.println("p1 barrel left");
			break;
		case 111:
			move(player2, 5);
			System.out.println("p1 barrel right");
			break;
		}
		if (code == KeyEvent.VK_SHIFT) {
			if (location == KeyEvent.KEY_LOCATION_LEFT) {
				move(player1, 0);
				System.out.println("p1 forwards");
			} else if (location == KeyEvent.KEY_LOCATION_LEFT) {
				move(player1, 0);
				System.out.println("p1 forwards");
			}
		}
	}

	public void keyReleased(KeyEvent arg0) {
		
	}

	public void keyTyped(KeyEvent arg0) {

		
	}
	
	public void move(Player player, int direction) {
		/*0 - forward
		1 - back
		2 - left
		3 - right
		 */
		int angle = player.angle;
		if (direction == 0) {
			if (angle >= 0 && angle<= 90) {
				player.x = angle * 0.11111111111111111111111111111111111111111111111111;
				player.y = (90 - angle) * 0.11111111111111111111111111111111111111111111111111;
			}
		}
	}
	//Graphics
	Image image = Toolkit.getDefaultToolkit().getImage("p1body.png");
	Image image2 = Toolkit.getDefaultToolkit().getImage("p1cannon.png");
	 public void paint(Graphics screen) {
		 while (true) {
			player1.draw(screen, 1);
         	player2.draw(screen, 2);
		 }
     }

}
