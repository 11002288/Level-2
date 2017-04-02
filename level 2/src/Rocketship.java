import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Rocketship extends GameObject {
	int xspeed;
	int yspeed;
	boolean right;
	boolean left;
	boolean up;
	boolean down;
    //x
	//y
	Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		
		// TODO Auto-generated constructor stub
	}

	void draw(Graphics g) {
		g.setColor(Color.BLUE);
		System.out.println("draw: " + x);
		g.fillRect(x, y, width, height);

	}

	void update() {

	if(up==true){
	y -= 5;	
		
	}
	if(down==true){
		y += 5;	
			
		}
	if(right==true){
	x += 5;	
			
		}
	if(left==true){
		x -= 5;	
			
		}
		System.out.println("update:" + x);
	}
}
