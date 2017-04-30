import java.awt.Graphics;

public class Rocketship extends GameObject {
	int speed;
	boolean right;
	boolean left;
	boolean up;
	boolean down;

	// x
	// y
	Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);

		// TODO Auto-generated constructor stub
	}

	void draw(Graphics g) {
		g.drawImage(GamePanel.alienImg, x, y, width, height, null);
	}

	void update() {
		super.update();
		if (up == true) {
			y -= 5;

		}
		if (down == true) {
			y += 5;

		}
		if (right == true) {
			x += 5;

		}
		if (left == true) {
			x -= 5;

		}
		// System.out.println("update:" + x);
	}
}
