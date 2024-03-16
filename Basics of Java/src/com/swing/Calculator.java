package com.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {

	JFrame frame;
	JLabel labelNo1, labelNo2, lblOut;
	JTextField txtNo1, txtNo2;
	JButton plusButton, minusButton, mulButton, divButton;

	public Calculator() {
		frame = new JFrame("Swing Demo");
		frame.setSize(400, 400);

		labelNo1 = new JLabel("First Number :: ");
		add(labelNo1, 20, 20, 120, 30);

		txtNo1 = new JTextField();
		add(txtNo1, 130, 20, 200, 30);

		labelNo1 = new JLabel("Second Number :: ");
		add(labelNo1, 20, 60, 120, 30);

		txtNo2 = new JTextField();
		add(txtNo2, 130, 60, 200, 30);

		plusButton = new JButton("+");
		plusButton.addActionListener(this);
		add(plusButton, 50, 120, 45, 45);

		minusButton = new JButton("-");
		minusButton.addActionListener(this);
		add(minusButton, 130, 120, 45, 45);

		mulButton = new JButton("*");
		mulButton.addActionListener(this);
		add(mulButton, 210, 120, 45, 45);

		divButton = new JButton("/");
		divButton.addActionListener(this);
		add(divButton, 290, 120, 45, 45);

		lblOut = new JLabel();
		add(lblOut, 50, 180, 300, 30);

		frame.setLayout(null);
		frame.setVisible(true);
	}

	void add(JComponent component, int x, int y, int w, int h) {
		component.setBounds(x, y, w, h);
		frame.add(component);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String outStr = "";
		double no1 = Double.parseDouble(txtNo1.getText());
		double no2 = Double.parseDouble(txtNo2.getText());

		if (e.getSource() == plusButton) {
			outStr = "Addtion of " + no1 + " and " + no2 + " is " + (no1 + no2);
		} else if (e.getSource() == minusButton) {
			outStr = "Difference between " + no1 + " and " + no2 + " is " + (no1 - no2);
		} else if (e.getSource() == mulButton) {
			outStr = "Product of " + no1 + " and " + no2 + " is " + (no1 * no2);
		} else if (e.getSource() == divButton) {
			outStr = "Division of " + no1 + " and " + no2 + " is " + (no1 / no2);
		}
		lblOut.setText(outStr);
	}

	public static void main(String[] args) {
		new Calculator();
	}

}
