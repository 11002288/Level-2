import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
	int xspeed;
	int yspeed;

	Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		xspeed = 5;
		yspeed = 5;
		// TODO Auto-generated constructor stub
	}

	void draw(Graphics g) {
		g.setColor(Color.BLUE);
		System.out.println("draw: " + x);
		g.fillRect(x, y, width, height);

	}

	void update() {
		x += xspeed;
		y += yspeed;
		System.out.println("update:" + x);
	}
}
