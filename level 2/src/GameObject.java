import java.awt.Graphics;

public class GameObject {
	int x;
	int y;
	int width;
	int height;

void update(){
	 x+=10;
	y += 20;
}
GameObject(int x ,int y){
	this.x = x;
	this.y = y;
}
void draw(Graphics g){
	g.fillRect(x, y, 100, 100);
}
}
