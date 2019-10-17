import java.awt.Dimension;

import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame frame;
	final int width = 500;
	final int height = 800;
	GamePanel GamePanel;

	public static void main(String[] args) {
		LeagueInvaders game = new LeagueInvaders();
		game.setup();
	}

	LeagueInvaders() {
		frame = new JFrame();
		GamePanel = new GamePanel();
	}

	public void setup() {
		frame.add(GamePanel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.getContentPane().setPreferredSize(new Dimension(width, height));
		frame.pack();
		frame.setVisible(true);
		GamePanel.startGame();
	}
	
}
