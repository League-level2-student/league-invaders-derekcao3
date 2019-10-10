import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame frame;
	final int width = 500;
	final int height = 800;

	public static void main(String[] args) {
		LeagueInvaders game = new LeagueInvaders();
		game.setup();
	}

	LeagueInvaders() {
		frame = new JFrame();
	}

	public void setup() {
		frame.show();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
	}
}
