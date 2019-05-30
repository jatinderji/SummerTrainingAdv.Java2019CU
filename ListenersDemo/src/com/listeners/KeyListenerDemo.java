package com.listeners;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class KeyListenerDemo extends JFrame
{
	JScrollPane sp;
	JTextArea txt;
	JLabel lbl;
	int r=0,g=0,b=0;
	KeyListenerDemo()
	{
	setSize(250,200);
	setTitle("KeyListener Demo");
	setLayout(new FlowLayout());
		
	sp = new JScrollPane();
	
	txt = new JTextArea(4,20);
//	txt.setLineWrap(true);
	sp.setViewportView(txt);
	add(sp);
	
	lbl = new JLabel("Nothing");
	lbl.setFont(new Font("Serif",Font.BOLD,22));
	add(lbl);
	
	txt.addKeyListener(new KeyAdapter() {
		
		@Override
		public void keyReleased(KeyEvent ke)
		{
			lbl.setText(""+ke.getKeyCode());
		}
		
	});
	
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);

	}

}
