import java.awt.Color;
import java.awt.Graphics;

public class Aliens extends GameObject{

	Aliens(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed = 10;
	}
	void draw(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(x, y, 30, 30);
	}

	void update() {
		super.update();
	y += speed;
	}
}
