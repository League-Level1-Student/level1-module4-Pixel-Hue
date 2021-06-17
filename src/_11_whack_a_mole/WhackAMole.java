package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton b;
	int score = 0;
	int badScore = 0;
	int r;
	Date d;

	public void setup() {

		d = new Date();
		drawButtons();

	}

	public void drawButtons() {
		if (frame != null) {
			frame.dispose();
		}
		frame = new JFrame();
		panel = new JPanel();
		int r = new Random().nextInt(24);

		for (int i = 0; i < 24; i++) {
			JButton b = new JButton("       ");
			b.addActionListener(this);
			if (i == r) {
				b.setText("Mole");
			}

			panel.add(b);
		}
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(220, 320);
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton buttonPressed = (JButton) e.getSource();

		if (buttonPressed.getText().equals("Mole")) {
			System.out.println("yes");
			score++;
		} else {
			badScore++;
			int r2 = new Random().nextInt(5);
			if (r2 == 0) {
				JOptionPane.showMessageDialog(null, "You missed");
			}
			if (r2 == 1) {
				JOptionPane.showMessageDialog(null, "You clicked the wrong button");
			}
			if (r2 == 2) {
				JOptionPane.showMessageDialog(null, "You should have pressed the Mole button");
			}
			if (r2 == 3) {
				JOptionPane.showMessageDialog(null, "You misclicked");
			}
			if (r2 == 4) {
				JOptionPane.showMessageDialog(null, "You didn't whack the mole");
			}
			if (badScore > 4) {
				JOptionPane.showMessageDialog(null, "You lost!");
				endGame(d, score);
				frame.dispose();
			}
		}
		System.out.println("Click");
		if (score > 9) {

			endGame(d, score);
			frame.dispose();
		}
		if (score < 10) {
			drawButtons();
		}

	}
}
