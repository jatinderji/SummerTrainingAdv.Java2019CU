package com.layouts;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyGrid extends JFrame
{
	JButton btn1,btn2,btn3,btn4,btn5,btn6;
	
	public MyGrid() {
		
		setSize(600,400);
		setTitle("GridLayout Demo");
		
		setLayout(new GridLayout(3, 2, 20,20));
		
		
		btn1 = new JButton("First");
		Font f = new Font("Arial", Font.BOLD, 20);
		btn1.setFont(f);
		add(btn1);
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {

				Random r = new Random();
				int n = r.nextInt(20)+1;
				btn1.setText(String.valueOf(n));
				
			}
		});

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

public class GridLayoutTask {

	public static void main(String[] args) {
		
	new MyGrid();

	}
}
