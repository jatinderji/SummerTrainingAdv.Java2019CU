package com.listeners;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ActionListenerDemo extends JFrame implements ActionListener
{
	JButton btn;
	
	ActionListenerDemo()
	{
		setSize(400,200);
		setTitle("ActionListener Demo");
		setLayout(new FlowLayout());
		
		btn = new JButton("First");
		add(btn);
		btn.addActionListener(this);
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JOptionPane.showMessageDialog(this, "Welcome Here to all");		
	}
}
