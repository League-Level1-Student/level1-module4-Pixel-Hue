package _01_nasty_surprise;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySuprise implements ActionListener {
	JButton button = new JButton();
	JButton button2 = new JButton();
	public NastySuprise() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		JLabel trick = new JLabel();
		JLabel Treat = new JLabel();
		trick.setText("Trick");
		Treat.setText("Treat");
		frame.add(panel);
		panel.add(button);
		panel.add(button2);
		button.add(trick);
		button2.add(Treat);
		frame.setVisible(true);
		frame.pack();

		button.addActionListener(this);
		button2.addActionListener(this);
	}
	
public static void main(String[] args) {
	NastySuprise ns = new NastySuprise();
}


private void showPictureFromTheInternet(String imageUrl) {
    try {
        URL url = new URL(imageUrl);
        Icon icon = new ImageIcon(url);
        JLabel imageLabel = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.add(imageLabel);
        frame.setVisible(true);
        frame.pack();
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }

}

@Override
public void actionPerformed(ActionEvent e) {
	if (e.getSource() == button) {
		showPictureFromTheInternet("https://www.rd.com/wp-content/uploads/2021/01/GettyImages-588935825.jpg");
	}
	else if (e.getSource() == button2) {
		showPictureFromTheInternet("https://variety.com/wp-content/uploads/2019/08/garfield-e1565072358875.jpg");
	}

	
	
}}	
	