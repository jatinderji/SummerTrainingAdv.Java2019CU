package com.advcontrols;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerDemo extends JFrame 
{

	JButton btn;
	JLabel lbl;
	int r=10,g=10,b=10;
	MouseListenerDemo()
	{

	setSize(400,200);
	setTitle("MouseListener Demo");
	setLayout(null);
	
	btn = new JButton("First");
	btn.setBounds(50,50,100,20);
	add(btn);
	
	JLabel lblpic = new JLabel(new ImageIcon("pics/dog1.jpg"));
	lblpic.setBounds(50,80,200,80);
	
	lbl = new JLabel();
	lbl.setOpaque(true);
	lbl.setBackground(new Color(232, 122, 150,60));
	lbl.setBounds(50,80,100,40);
	add(lbl);
	
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
