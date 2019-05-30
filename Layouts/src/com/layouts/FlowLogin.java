package com.layouts;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class MyLogin extends JFrame
{
	JLabel lblName,lblPass;
	JTextField txtUname;
	JPasswordField txtPass;
	JButton btnLogin,btnCancel;

	public MyLogin()
	{
		setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		setSize(260,110);
		getContentPane().setBackground(Color.YELLOW);
		
		lblName = new JLabel("Username");
		add(lblName);
		
		txtUname = new JTextField(10);
		add(txtUname);
		
		lblPass = new JLabel("Password");
		add(lblPass);

		txtPass = new JPasswordField(10);
		add(txtPass);
		
		btnLogin = new JButton("Login");
		add(btnLogin);
		
		btnCancel = new JButton("Cancel");
		add(btnCancel);
		btnCancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				
			}
		});
		
		setUndecorated(true);
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}
}
public class FlowLogin {
/*
	public static void main(String[] args) {

			new MyLogin();
	}
*/
}
