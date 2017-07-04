package de.cppvoid.swingevent;

import java.awt.FlowLayout;

import javax.swing.*;

public class MyWindow {
	private JFrame frame = new JFrame();
	private JButton button = new JButton("Hello");
	
	public MyWindow() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.add(button);
		frame.pack();
		frame.setVisible(true);
	}
	
	public JButton getButton() {
		return button;
	}
}
