import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends GameObject {
	Projectile(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	int speed = 10;

	void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(x, y, 10, 30);
	}

	void update() {
		super.update();
		y -= speed;
		if (y <= 0) {
			isAlive = false;
		}

	}

}
