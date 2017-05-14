import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MemoryGame {
	final static int height = 400;
	final static int width = 400;
	JFrame frame;
public static void main(String[] args) {
	MemoryGame mg = new MemoryGame();
}
MemoryGame(){
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	
	JButton Autton = new JButton();
	JButton Cutton = new JButton();
	JButton Dutton = new JButton();	
frame.add(panel);
panel.add(button);
panel.add(Autton);
panel.add(Cutton);
panel.add(Dutton);

	frame.setSize(width, height);
	frame.setVisible(true);
	button.setSize(150,150);
	Autton.setSize(150,150);
	Dutton.setSize(150,150);
	Cutton.setSize(150,150);
	Autton.setLocation(200, 200);
	button.setLocation(25, 200);
	Cutton.setLocation(25, 200);
	
	
	
	
}
}
