import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
	Timer time; 
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
int currentState = MENU_STATE;
	//GameObject go;
	GamePanel(){
		 time = new Timer(1000 / 60, this);
	//	go = new GameObject(100, 100);
	}
	void currentState(){
	
	}
	void updateMenuState(){
		
	}
	void updateGameState(){
		
	}
	void updateEndState(){
		
	}
	void drawcurrentState(){
		
	}
	void drawupdateMenuState(Graphics g){
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);    

	}
	void drawupdateGameState(Graphics g){
		
	}
	void drawupdateEndState(Graphics g){
		
	}
void startGame(){
time.start();	
	
}
public void paintComponent(Graphics g){
//go.draw(g);
	if(currentState == MENU_STATE){
		drawupdateMenuState(g);
	}else if(currentState == GAME_STATE){
		drawupdateGameState(g);
	}else if(currentState == END_STATE){
		drawupdateEndState(g);
	}

//g.fillRect(10, 10, 100, 100);
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	//go.update();
		if(currentState == MENU_STATE){
			updateMenuState();
		}else if(currentState == GAME_STATE){
			updateGameState();
		}else if(currentState == END_STATE){
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
		System.out.println("Look left-------> I said left");
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("sup");
	}
	
}

