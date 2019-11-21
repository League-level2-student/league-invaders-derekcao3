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
		if (left) {
			x = x - speed;
		}
		if (right) {
			x = x + speed;
		}
		if (down) {
			y = y + speed;
		}
		if (up) {
			y = y - speed;
		}

	}

	void draw(Graphics g) {
		g.setColor(Color.BLUE);

		g.fillRect(x, y, width, height);

	}

}
