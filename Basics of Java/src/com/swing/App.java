package com.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

// write a program to create a UI using java swing which takes 2 numbers as an input 
// and displays its addition on UI (using label or textField)

public class App implements ActionListener {

	JFrame frame;
	JLabel label, labelOut;
	JTextField text;
	JButton button;

	public App() {
		createFrame();
		createLabel();
		createText();

		button = new JButton("Click");
		button.setBounds(130, 100, 100, 30);
		button.addActionListener(this);
		frame.add(button);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (labelOut == null) {
			labelOut = new JLabel();
			labelOut.setBounds(50, 140, 300, 30);
			frame.add(labelOut);
		}
		labelOut.setText(text.getText());
	}

	private void createText() {
		text = new JTextField(15);
		text.setBounds(50, 50, 280, 30);
		frame.add(text);
	}

	private void createLabel() {
		label = new JLabel("**** SWING DEMO ****");
		label.setBounds(120, 20, 300, 30);
		frame.add(label);
	}

	private void createFrame() {
		frame = new JFrame("Swing Demo");
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new App();
	}

}
