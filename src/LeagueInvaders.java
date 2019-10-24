import java.awt.Dimension;

import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame frame;
	static final int width = 500;
	static final int height = 800;
	GamePanel gamePanel;

	public static void main(String[] args) {
		LeagueInvaders game = new LeagueInvaders();
		game.setup();
	}

	LeagueInvaders() {
		frame = new JFrame();
		gamePanel = new GamePanel();
	}

	public void setup() {
		frame.add(gamePanel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.getContentPane().setPreferredSize(new Dimension(width, height));
		frame.pack();
		frame.setVisible(true);
		gamePanel.startGame();
		frame.addKeyListener(gamePanel);
	}
	
}
