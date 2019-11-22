import java.awt.Color;
import java.awt.Graphics;

public class Alien extends GameObject {
	int speedx =5;
	int speedy=3;
	
	Alien(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	void update() {
        super.update();
		y += speedy;
		
		if (x <= 0) {
			speedx = -speedx;
			
		}
		else if (x >= LeagueInvaders.width) {
			speedx = -speedx;
		}
		x+=speedx;
	}

	void draw(Graphics g) {
 g.drawImage(GamePanel.alienImg, x, y, width, height, null);

	}
}
