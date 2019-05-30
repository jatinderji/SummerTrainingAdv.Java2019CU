package com.layouts;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

class MyWindow extends JFrame
{
	JButton btn1,btn2,btn3,btn4;
	
	public MyWindow() {
		
		setSize(600,400);
		setTitle("FlowLayout Demo");
		
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		
		btn1 = new JButton("First");
		add(btn1);

		btn2 = new JButton("Second");
		add(btn2);
		
		btn3 = new JButton("Three");
		add(btn3);
		
		btn4 = new JButton("Four");
		add(btn4);
		

		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
}
public class FlowLayoutDemo
{
/*	public static void main(String[] args) {
		new MyWindow();
	}
*/
	}
