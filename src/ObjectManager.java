import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectManager {
	Rocketship rocketship;

	ObjectManager(Rocketship rocketship) {
		this.rocketship = rocketship;
	}

	ArrayList<Projectile> projectiles = new ArrayList<Projectile>();

	void addProjectile(Projectile projectile) {
		projectiles.add(projectile);
	}

	void update() {
		rocketship.update();
		for (Projectile p : projectiles) {
			p.update();
		}
		for (Alien p : aliens) {
			p.update();
		}
	}

	ArrayList<Alien> aliens = new ArrayList<Alien>();

	void addAlien(Alien alien) {
		aliens.add(alien);
	}

	void draw(Graphics g) {
		rocketship.draw(g);
		for (Projectile p : projectiles) {
			p.draw(g);
		}
		for (Alien p : aliens) {
			p.draw(g);
		}

	}

}