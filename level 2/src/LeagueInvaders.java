import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class LeagueInvaders {
	final int height = 800;
	final int width = 500;
JFrame frame;
GamePanel panel;
public static void main(String[] args) {
	LeagueInvaders li = new LeagueInvaders();
	
	
}


LeagueInvaders(){
	frame = new JFrame();
	panel = new GamePanel();
	setup();			
	frame.addKeyListener(panel);
	}
 void setup() {
	frame.setVisible(true);
	 frame.setSize(700, 500);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
	panel.startGame();
}


}
