package extra;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Level1Test implements ActionListener {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton yellow = new JButton();
	JButton red = new JButton();
	JButton blue = new JButton();
	JButton green = new JButton();

	public static void main(String[] args) {
		Level1Test l1 = new Level1Test();
		l1.Jstuff();
	}

	public void Jstuff() {

		f.add(p);
		p.add(yellow);
		p.add(red);
		p.add(blue);
		p.add(green);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		yellow.addActionListener(this);
		red.addActionListener(this);
		green.addActionListener(this);
		blue.addActionListener(this);
		f.setVisible(true);
		f.pack();
		yellow.setBackground(Color.YELLOW);
		yellow.setOpaque(true);
		red.setBackground(Color.RED);
		red.setOpaque(true);
		blue.setBackground(Color.BLUE);
		blue.setOpaque(true);
		green.setBackground(Color.GREEN);
		green.setOpaque(true);
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if ((JButton) e.getSource() == yellow) {
			speak("yellow");
		} else if ((JButton) e.getSource() == red) {
			speak("red");
		} else if ((JButton) e.getSource() == blue) {
			speak("blue");
		} else if ((JButton) e.getSource() == green) {
			speak("green");
		}
	}
}
