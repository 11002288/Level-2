import java.awt.Graphics;

public class Aliens extends GameObject {

	Aliens(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed = 10;
	}

	void draw(Graphics g) {
		g.drawImage(GamePanel.rocketImg, x, y, width, height, null);

	}

	void update() {
		super.update();
		y += speed;
	}
}
