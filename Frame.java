import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class Frame extends JFrame{
	public Frame(int w, int h) {
		super();
		this.setSize(new Dimension(w, h));
		this.setResizable(false);
		this.getContentPane().setBackground(Main.DEF);
		this.setLocationRelativeTo(null);
		this.setLayout(new FlowLayout(5, 5, FlowLayout.LEFT));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setLayout(new GridLayout(1,2));
		this.setVisible(true);
	}
}
