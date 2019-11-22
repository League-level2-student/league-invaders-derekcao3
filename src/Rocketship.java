import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Rocketship extends GameObject {
	int speed;

	Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed = 10;

		// TODO Auto-generated constructor stub
	}

	boolean left = false;
	boolean right = false;
	boolean down = false;
	boolean up = false;

	void update() {
        super.update();
		if (left && x > 0) {
			x = x - speed;
		}
		if (right && x<LeagueInvaders.width-width) {
			x = x + speed;
		}
		if (down && y<LeagueInvaders.height-height) {
			y = y + speed;
		}
		if (up && y>0) {
			y = y - speed;
		}

	}

	void draw(Graphics g) {
		  g.drawImage(GamePanel.rocketImg, x, y, width, height, null);

	}

}
