package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
Random rand = new Random();
JButton button = new JButton();
JButton button2 = new JButton();
JButton button3 = new JButton();
JButton button4 = new JButton();
JButton button5 = new JButton();
JButton button6 = new JButton();
JButton button7 = new JButton();
JButton button8 = new JButton();
JButton button9 = new JButton();
JButton button10 = new JButton();
JButton button11 = new JButton();
JButton button12 = new JButton();
JButton button13 = new JButton();
JButton button14 = new JButton();
JButton button15 = new JButton();
JButton button16 = new JButton();
JButton button17 = new JButton();
JButton button18 = new JButton();
JButton button19 = new JButton();
JButton button20 = new JButton();
JButton button21 = new JButton();
JButton button22 = new JButton();
JButton button23 = new JButton();
JButton button24 = new JButton();
	public void setup() {
		rand.nextInt(24);
		frame.add(panel);
		frame.setVisible(true);
		panel.add(button);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button10);
		panel.add(button11);
		panel.add(button12);
		panel.add(button13);
		panel.add(button14);
		panel.add(button15);
		panel.add(button16);
		panel.add(button17);
		panel.add(button18);
		panel.add(button19);
		panel.add(button20);
		panel.add(button21);
		panel.add(button22);
		panel.add(button23);
		panel.add(button24);
		button.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		button10.addActionListener(this);
		button11.addActionListener(this);
		button12.addActionListener(this);
		button13.addActionListener(this);
		button14.addActionListener(this);
		button15.addActionListener(this);
		button16.addActionListener(this);
		button17.addActionListener(this);
		button18.addActionListener(this);
		button19.addActionListener(this);
		button20.addActionListener(this);
		button21.addActionListener(this);
		button22.addActionListener(this);
		button23.addActionListener(this);
		button24.addActionListener(this);
		button.setText("     ");
		button2.setText("     ");
		button3.setText("     ");
		button4.setText("     ");
		button5.setText("     ");
		button6.setText("     ");
		button7.setText("     ");
		button8.setText("     ");
		button9.setText("     ");
		button10.setText("     ");
		button11.setText("     ");
		button12.setText("     ");
		button13.setText("     ");
		button14.setText("     ");
		button15.setText("     ");
		button16.setText("     ");
		button17.setText("     ");
		button18.setText("     ");
		button19.setText("     ");
		button20.setText("     ");
		button21.setText("     ");
		button22.setText("     ");
		button23.setText("     ");
		button24.setText("     ");
		frame.setSize(200, 330);
		
button3.setText("Clk");
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("Click");
		
	}
}
