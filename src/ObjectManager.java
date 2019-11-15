import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	Rocketship rocketship;
	long enemyTimer =0;
	int enemySpawnTime =2000;

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

	public void manageEnemies() {
		if (System.currentTimeMillis() - enemyTimer >= enemySpawnTime) {
			addAlien(new Alien(new Random().nextInt(LeagueInvaders.width), 0, 50, 50));

			enemyTimer = System.currentTimeMillis();
		}
		
	}

	ArrayList<Alien> aliens = new ArrayList<Alien>();

	void addAlien(Alien alien) {
		aliens.add(alien);
	}
void purgeObjects() {
	for (int i = aliens.size()-1; i > 0; i++) {
		if(!aliens.get(i).isAlive) {
			aliens.remove(i);
		}
	}
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