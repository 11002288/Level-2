import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer time;
	Font titleFont;
	Rocketship rs;
	ObjectManager Om;
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	public static BufferedImage alienImg;
	public static BufferedImage rocketImg;
	public static BufferedImage bulletImg;

	// GameObject go;
	GamePanel() {

		time = new Timer(1000 / 60, this);
		rs = new Rocketship(250, 700, 50, 50);
		// go = new GameObject(100, 100);
		titleFont = new Font("Arial", Font.PLAIN, 48);
		Om = new ObjectManager();
		Om.addObject(rs);
		try {
			alienImg = ImageIO.read(this.getClass().getResourceAsStream("alien.png"));
			rocketImg = ImageIO.read(this.getClass().getResourceAsStream("rocket.png"));
			bulletImg = ImageIO.read(this.getClass().getResourceAsStream("bullet.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	void currentState() {

	}

	void updateMenuState() {

	}

	void updateGameState() {
		System.out.println("check");
		rs.update();
		Om.update();
		Om.manageEnemies();
		Om.checkCollision();
		if (!rs.isAlive) {
			currentState = END_STATE;
			Om.reset();
			rs = new Rocketship(250, 700, 50, 50);
			Om.addObject(rs);
		}
	}

	void updateEndState() {

	}

	void drawcurrentState() {

	}

	void drawupdateMenuState(Graphics g) {
		Om.setScore(0);
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
		g.setColor(Color.ORANGE);
		g.setFont(titleFont);
		g.drawString("League Invaders", 30, 100);
		g.drawString("Press enter to Play!!!", 30, 200);
		g.drawString("Press Space To Shoot ", 0, 400);
		g.drawString("and Arrows to move", 10, 470);
	}

	void drawupdateGameState(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
		Om.draw(g);

	}

	void drawupdateEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
		g.setFont(titleFont);
		g.setColor(Color.GREEN);
		g.drawString("Game Over", 30, 100);
		g.drawString("Press ENTER to ", 40, 300);
		g.drawString("Restart", 50, 400);
		g.drawString("Score:" + Om.getScore(), 250, 400);

	}

	void startGame() {
		time.start();

	}

	public void paintComponent(Graphics g) {
		// go.draw(g);
		if (currentState == MENU_STATE) {
			drawupdateMenuState(g);
		} else if (currentState == GAME_STATE) {
			drawupdateGameState(g);
		} else if (currentState == END_STATE) {
			drawupdateEndState(g);
		}

		// g.fillRect(10, 10, 100, 100);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// go.update();
		if (currentState == MENU_STATE) {
			updateMenuState();
		} else if (currentState == GAME_STATE) {
			updateGameState();
		} else if (currentState == END_STATE) {
			updateEndState();
		}

		repaint();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("sup");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		// System.out.println("Look left-------> I said left");
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {

			currentState++;
		}
		if (currentState > END_STATE) {
			currentState = MENU_STATE;
		}

		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			rs.right = true;
			System.out.println("right");
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			rs.left = true;
			System.out.println("right");
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			rs.up = true;

		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			rs.down = true;

		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			Om.addObject(new Projectile(rs.x + rs.width / 2, rs.y, 10, 10));

		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		// System.out.println("sup");
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			rs.right = false;
			System.out.println("right");
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			rs.left = false;
			System.out.println("right");
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			rs.up = false;

		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			rs.down = false;

		}

	}
}
