package com.listeners;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MouseListenerDemo extends JFrame 
{

	JButton btn;
	int r=10,g=10,b=10;
	MouseListenerDemo()
	{

	setSize(400,200);
	setTitle("MouseListener Demo");
	setLayout(null);
	
	btn = new JButton("First");
	btn.setBounds(50,50,100,20);
	add(btn);
	
	addMouseListener(new MouseAdapter() {
		
		@Override
		public void mouseClicked(MouseEvent me) {
			System.out.println(me.getButton());
			
			btn.setBounds(me.getX(),me.getY(),100,20);
			getContentPane().setBackground(new Color(r, g, b));
		}
	});
	
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
	}
}
