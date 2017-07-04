package de.cppvoid.swingevent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class MyWindowController implements ActionListener {

	private JButton button;
	
	public MyWindowController(MyWindow window) {
		this.button = window.getButton();
		button.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			System.out.println(":O");
		}
	}

}
