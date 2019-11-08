import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectManager {
Rocketship rocketship;
ObjectManager(Rocketship rocketship){
this.rocketship = rocketship;
}
ArrayList<Projectile> projectiles = new ArrayList<Projectile>();

void addProjectile(Projectile projectile) {
	projectiles.add(projectile);
}
void update() {
	rocketship.update();
	for (Projectile p:projectiles){
		p.update();
	}
}
void draw(Graphics g) {
rocketship.draw(g);
for (Projectile p:projectiles){
	p.draw(g);
}
}

}