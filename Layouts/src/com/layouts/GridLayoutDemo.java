package com.layouts;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyGridWindow extends JFrame
{
	JButton btn1,btn2,btn3,btn4,btn5,btn6;
	
	public MyGridWindow() {
		
		setSize(600,400);
		setTitle("GridLayout Demo");
		
		setLayout(new GridLayout(3, 2, 20,20));
		
		
		btn1 = new JButton("First");
		add(btn1);

		btn2 = new JButton("Second");
		add(btn2);
		
		btn3 = new JButton("Three");
		add(btn3);
		
		btn4 = new JButton("Four");
		add(btn4);
		
		btn5 = new JButton("Five");
		add(btn5);
		
		btn6 = new JButton("Six");
		add(btn6);
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
}

public class GridLayoutDemo {

	public static void main(String[] args) {
		
	new MyGridWindow();

	}
}
