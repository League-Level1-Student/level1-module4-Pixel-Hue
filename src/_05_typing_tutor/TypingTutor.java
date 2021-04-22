package _05_typing_tutor;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	  char currentLetter;
	public static void main(String[] args) {
		TypingTutor tutor = new TypingTutor();
		tutor.setup(); 
	}
	 void setup(){
         JFrame frame = new JFrame();
         JPanel panel = new JPanel();
         JLabel label = new JLabel();
         frame.addKeyListener(this);
         label.setFont(label.getFont().deriveFont(28.0f));
         label.setHorizontalAlignment(JLabel.CENTER);
      currentLetter = generateRandomLetter();
        
         }
	 char generateRandomLetter() {
		    Random r = new Random();
		    return (char) (r.nextInt(26) + 'a');
		}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		//print out key pressed on keyboard
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
	//RESET currentletter
		//Update JLabel
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
