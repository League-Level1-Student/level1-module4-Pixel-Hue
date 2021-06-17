package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	int num1;
	int num2;
	int answer;
	JTextField field = new JTextField(10);
	JTextField field2 = new JTextField(10);
	JButton button = new JButton("add");
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	
public void setup() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		
		
		
		
		frame.add(panel);
		panel.add(field);
		panel.add(field2);
		panel.add(button);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		
		
		
		button.setText("Add");
		button2.setText("Subtract");
		button3.setText("Multiply");
		button4.setText("Divide");
		button.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		frame.pack();
	}
	public void add() {
		String nums1 = field.getText();
		String nums2 = field2.getText();
		num1 = Integer.parseInt(nums1);
		num2 = Integer.parseInt(nums2);
		answer = num1 + num2;
		System.out.println(answer);
	}
	public void multiply() {
		String nums1 = field.getText();
		String nums2 = field2.getText();
		num1 = Integer.parseInt(nums1);
		num2 = Integer.parseInt(nums2);
		answer = num1 * num2;
		System.out.println(answer);
	}
	public void subtract() {
		String nums1 = field.getText();
		String nums2 = field2.getText();
		num1 = Integer.parseInt(nums1);
		num2 = Integer.parseInt(nums2);
		answer = num1 - num2;
		System.out.println(answer);
	}
	public void divide() {
		String nums1 = field.getText();
		String nums2 = field2.getText();
		num1 = Integer.parseInt(nums1);
		num2 = Integer.parseInt(nums2);
		answer = num1/num2;
		System.out.println(answer);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		System.out.println(buttonPressed);
		if (buttonPressed == button) {
			add();
		}
		else if (buttonPressed == button2) {
			subtract();
		}
		else if (buttonPressed == button3) {
			multiply();
		}
		else if (buttonPressed == button4) {
			divide();
		}
	}
	
}
