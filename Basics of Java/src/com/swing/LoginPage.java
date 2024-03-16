package com.swing;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage extends JFrame {
	private static final long serialVersionUID = 1L;

	JLabel lblUsername, lblPassword;
	JTextField username;
	JPasswordField password;
	JButton loginButton;

	public LoginPage() {
		super("Login");
		setSize(420, 230);

		lblUsername = new JLabel("Username");
		add(lblUsername, 20, 20, 120, 30);

		username = new JTextField();
		add(username, 130, 20, 240, 30);

		lblPassword = new JLabel("Password");
		add(lblPassword, 20, 60, 120, 30);

		password = new JPasswordField();
		add(password, 130, 60, 240, 30);

		loginButton = new JButton("Login");
		add(loginButton, 160, 120, 100, 45);

		loginButton.addActionListener(ae -> {
			if (username.getText().equals(new String(password.getPassword()))) {
				JDialog newDialog = new JDialog(this, "Home Page");
				newDialog.setSize(400, 600);
				
				JLabel newLable = new JLabel("Hello, " + username.getText());
				newLable.setBounds(50, 50, 300, 30);
				newDialog.add(newLable);
				
				newDialog.setLayout(null);
				newDialog.setVisible(true);
			} else {
				JOptionPane.showMessageDialog(this, "OOPs.. Invalid credentials", "Failed", JOptionPane.ERROR_MESSAGE);
			}
		});

		setLayout(null);
		setVisible(true);
	}

	void add(JComponent component, int x, int y, int w, int h) {
		component.setBounds(x, y, w, h);
		super.add(component);
	}

	public static void main(String[] args) {
		new LoginPage();
	}

}
