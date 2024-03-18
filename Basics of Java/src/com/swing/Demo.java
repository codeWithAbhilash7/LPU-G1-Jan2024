package com.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class Demo implements ActionListener {

	JFrame frame;
	JTextArea textArea;
	JCheckBox cbCPP, cbJava;
	JRadioButton rbMale, rbFemale;
	JComboBox<String> cities;

	public Demo() {
		frame = new JFrame("Swing Demo");
		frame.setSize(400, 400);

//		textArea = new JTextArea();
//		add(textArea, 20, 20, 250, 50);

//		JButton button = new JButton("Click");
//		add(button, 20, 20, 150, 30);
//		button.addActionListener(this);

		// check box
//		cbCPP = new JCheckBox("C++");
//		add(cbCPP, 20, 80, 80, 30);
//
//		cbJava = new JCheckBox("Java");
//		add(cbJava, 130, 80, 150, 30);

		// radio button
//		rbMale = new JRadioButton("Male");
//		add(rbMale, 20, 80, 80, 30);
//
//		rbFemale = new JRadioButton("Female");
//		add(rbFemale, 130, 80, 150, 30);
//
//		ButtonGroup bg = new ButtonGroup();
//		bg.add(rbFemale);
//		bg.add(rbMale);

		// combobox / dropdown
//		String city[] = { "Delhi", "Mumbai", "Pune" };
//		cities = new JComboBox<String>(city);
//		cities.addItem("Delhi");
//		cities.addItem("Mumbai");
//		cities.addItem("Pune");

//		add(cities, 20, 80, 80, 30);

		String[] columnName = { "First Name", "Last Name", "Sport", "# of Years", "Vegetarian" };
		Object[][] data = { { "Kathy", "Smith", "Snowboarding", new Integer(5), new Boolean(false) },
				{ "John", "Doe", "Rowing", new Integer(3), new Boolean(true) },
				{ "Sue", "Black", "Knitting", new Integer(2), new Boolean(false) },
				{ "Jane", "White", "Speed reading", new Integer(20), new Boolean(true) },
				{ "Joe", "Brown", "Pool", new Integer(10), new Boolean(false) } };

		JTable table = new JTable(data, columnName);

		JScrollPane pane = new JScrollPane(table);
		pane.setBounds(0, 0, 800, 150);

		frame.add(pane);
		
		frame.setLayout(null);
		frame.setVisible(true);
	}

	void add(JComponent component, int x, int y, int w, int h) {
		component.setBounds(x, y, w, h);
		frame.add(component);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		if (cbCPP.isSelected()) {
//			System.out.print("C++\t");
//		}
//		if (cbJava.isSelected()) {
//			System.out.println("Java\n");
//		}
//		System.out.println("");

//		if (rbMale.isSelected()) {
//			System.out.println("Male");
//		}
//		if (rbFemale.isSelected()) {
//			System.out.println("Female");
//		}

//		System.out.println("City=" + cities.getSelectedItem());
	}

	public static void main(String[] args) {
		new Demo();

	}

}
