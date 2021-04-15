package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
public static void main(String[] args) {
	ChuckleClicker button = new ChuckleClicker();
	button.makeButtons();
}
JButton button1 = new JButton();
JButton button2 = new JButton();
Random ran = new Random();
public void makeButtons() {
	JOptionPane.showMessageDialog(null, "Make button");
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	button1.setText("Joke");
	button2.setText("Punchline");
	button1.setSize(64, 64);
	button2.setSize(64, 64);
	frame.setVisible(true);
	frame.pack();
	button1.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	JButton buttonpressed = (JButton) e.getSource();
	if (buttonpressed == button1) {
		int joke = ran.nextInt(3);
		if (joke == 0) {
			JOptionPane.showMessageDialog(null, "The bee.");
		}
if (joke == 1) {
	JOptionPane.showMessageDialog(null, "There is a bee");
		}
if (joke == 2) {
	JOptionPane.showMessageDialog(null, "The bee is chasing you");
}
	}
	else if (buttonpressed == button2) {
		int joke = ran.nextInt(3);
		if (joke == 0) {
			JOptionPane.showMessageDialog(null, "you better bee careful");
		}
if (joke == 1) {
	JOptionPane.showMessageDialog(null, "you better bee running");
		}
if (joke == 2) {
	JOptionPane.showMessageDialog(null, "this is gonna bee very unfunny");
}
	}
	
}

}
