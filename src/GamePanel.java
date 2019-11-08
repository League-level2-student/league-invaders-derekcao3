import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer timer;
	GameObject gameObject;
	Font titleFont;
	Font titleFont2;
	Rocketship rocket = new Rocketship(250,700,50,50);
	
	final int MENU_STATE = 0;

	final int GAME_STATE = 1;

	final int END_STATE = 2;
	int currentState = MENU_STATE;
	ObjectManager object = new ObjectManager(rocket);
	GamePanel() {

		timer = new Timer(1000 / 60, this);
		titleFont = new Font("Arial",Font.PLAIN,48);
		titleFont2 = new Font("Arial",Font.PLAIN,20);
	}

	@Override

	public void paintComponent(Graphics g) {
		if (currentState == MENU_STATE) {

			drawMenuState(g);

		} else if (currentState == GAME_STATE) {

			drawGameState(g);

		} else if (currentState == END_STATE) {

			drawEndState(g);

		}
	}

	void updateMenuState() {

	}

	void updateGameState() {
object.update();
	}

	void updateEndState() {

	}

	void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);

		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
		g.setFont(titleFont);
		g.setColor(Color.WHITE);
		g.drawString("LEAGUE INVADERS", 20, 100);
		g.setFont(titleFont2);
		g.setColor(Color.WHITE);
		g.drawString("Press ENTER to start", 135, 328);
		g.setFont(titleFont2);
		g.setColor(Color.WHITE);
		g.drawString("Press SPACE for instructions", 100, 500);
	}

	void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);

		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
		object.draw(g);
	
	}

	void drawEndState(Graphics g) {
		g.setColor(Color.RED);

		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
		g.setFont(titleFont);
		g.setColor(Color.WHITE);
		g.drawString("GAME OVER", 95, 100);
		g.setFont(titleFont2);
		g.setColor(Color.WHITE);
		g.drawString("You Killed 0 Enemies", 135, 328);
		g.setFont(titleFont2);
		g.setColor(Color.WHITE);
		g.drawString("Press ENTER to resart", 125, 500);
		
	}

	void startGame() {
		timer.start();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (currentState == MENU_STATE) {

			updateMenuState();

		} else if (currentState == GAME_STATE) {

			updateGameState();

		} else if (currentState == END_STATE) {

			updateEndState();

		}
		repaint();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("1");
		if(KeyEvent.VK_ENTER==arg0.getKeyCode()) {
		
		if (currentState == END_STATE) {

			currentState = MENU_STATE;

		}
		else if (currentState < END_STATE) {

			currentState++;

		}
		}
	
		if(KeyEvent.VK_LEFT==arg0.getKeyCode()) {
			rocket.left=true;
		}
		else if(KeyEvent.VK_RIGHT==arg0.getKeyCode()) {
			rocket.right=true;
		}
		else if(KeyEvent.VK_DOWN==arg0.getKeyCode()) {
			rocket.down=true;
		}
		else if(KeyEvent.VK_UP==arg0.getKeyCode()) {
			rocket.up=true;
		}

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("2");
		if(KeyEvent.VK_LEFT==arg0.getKeyCode()) {
			rocket.left=false;
		}
		else if(KeyEvent.VK_RIGHT==arg0.getKeyCode()) {
			rocket.right=false;
		}
		else if(KeyEvent.VK_DOWN==arg0.getKeyCode()) {
			rocket.down=false;
		}
		else if(KeyEvent.VK_UP==arg0.getKeyCode()) {
			rocket.up=false;
		}
		if(KeyEvent.VK_SPACE==arg0.getKeyCode()) {
			 object.addProjectile(new Projectile(rocket.x, rocket.y, 10, 10));
			
			}

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("3");
	}

}
