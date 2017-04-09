import java.awt.Graphics;
import java.awt.Rectangle;

public class GameObject {
	int speed;
	int x;
	int y;
	int width;
	int height;
	boolean isAlive;
	Rectangle collisionBox = new Rectangle();
	void update() {
		collisionBox.setBounds(x, y, width, height);
	}

	GameObject(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		isAlive = true;		
		

	}

	void draw(Graphics g) {

	}

}
