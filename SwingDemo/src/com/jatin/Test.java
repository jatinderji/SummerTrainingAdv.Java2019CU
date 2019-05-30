package com.jatin;

import java.awt.Button;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class MyWindow extends JFrame implements ActionListener
{
	JLabel lblFirst,lblSecond,lblResult,lblImage;
	JTextField txtOne,txtTwo;
	JButton btnAdd;
	Button btnAdd1;
	
	MyWindow()
	{
		setTitle("My AWT Window");
		setSize(500, 400);
		setLayout(null);
		
	
		lblFirst = new JLabel("1st Number");
		lblFirst.setBounds(50, 100, 100, 20);
		add(lblFirst);

		lblSecond = new JLabel("2nd Number");
		lblSecond.setBounds(50, 130, 100, 20);
		add(lblSecond);
		
		txtOne = new JTextField();
		txtOne.setBounds(160, 100, 100, 20);
		add(txtOne);
		
		
		txtTwo = new JTextField();
		txtTwo.setBounds(160, 130, 100, 20);
		add(txtTwo);
		
		btnAdd = new JButton("Add");
		btnAdd.setBounds(50, 155, 80, 20);
		add(btnAdd);
		btnAdd.addActionListener(this);
		

		btnAdd1 = new Button("Add");
		btnAdd1.setBounds(140, 155, 80, 20);
		add(btnAdd1);
		setResizable(false);
		
		ImageIcon img = new ImageIcon("images/dog1.jpg");
		lblImage = new JLabel(img);
		lblImage.setBounds(250,155,150,400);
		add(lblImage);
		
		
		getContentPane().setBackground(Color.CYAN);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		setLocationRelativeTo(null);

		ImageIcon imgIcon = new ImageIcon("images/skype.png");
		
		setIconImage(imgIcon.getImage());
		
		setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btnAdd)
		{
				if(txtOne.getText().length()<1)
					lblResult.setText("Please enter number ");
				else
				{
					int sum = Integer.parseInt(txtOne.getText())+
							Integer.parseInt(txtTwo.getText());
					lblResult.setText("Result: "+sum);	
				}
			
		}			
	}

}

public class Test {

	public static void main(String[] args) {
		
		MyWindow w =new MyWindow();

	}

}
