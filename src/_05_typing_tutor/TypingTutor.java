package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	  char currentLetter;
	  JFrame frame = new JFrame();
      JPanel panel = new JPanel();
      JLabel label = new JLabel();
      Date timeAtStart = new Date();
      int correctchartyped = 0;
	public static void main(String[] args) {
		TypingTutor tutor = new TypingTutor();
		tutor.setup(); 
		
	}
	 void setup(){
        frame.add(label);
         frame.setVisible(true);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.addKeyListener(this);
         currentLetter = generateRandomLetter();
 		String s = "" + currentLetter;
 		label.setText(s);
         label.setFont(label.getFont().deriveFont(28.0f));
         label.setHorizontalAlignment(JLabel.CENTER);
     
        frame.pack();
        panel.setOpaque(true);
         }
	 char generateRandomLetter() {
		    Random r = new Random();
		    return (char) (r.nextInt(26) + 'a');
		}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		char keyPressed = (char) e.getKeyChar();
		System.out.println("You pressed : " + keyPressed);
		if (keyPressed == currentLetter) {
			//frame.setBackground(Color.GREEN);
			//frame.pack();
			System.out.println("correct");
			correctchartyped++;
		}
		else {
			System.out.println("incorrect");
		}
		if (correctchartyped == 20) {
			showTypingSpeed(correctchartyped);
		}
		//print out key pressed on keyboard
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		String s = "" + currentLetter;
		label.setText(s);
	//RESET currentletter
		//Update JLabel
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
	    Date timeAtEnd = new Date();
	    long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
	    long gameInSeconds = (gameDuration / 1000) % 60;
	    double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
	    int charactersPerMinute = (int) (charactersPerSecond * 60);
	    JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
	} 
}
