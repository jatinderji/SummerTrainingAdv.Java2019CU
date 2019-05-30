package com.layouts;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyBroderWindow extends JFrame implements ActionListener
{
	JButton btnEast,btnWest,btnNorth,btnSouth;
	JLabel lblCenter;

	String pics[]= {"images/dog1.jpg","images/dog2.jpg","images/dog3.jpg",
			"images/canadaflag.png","images/backpic.jpg"};
	
	public MyBroderWindow()
	{
		setLayout(new BorderLayout());
		setSize(600,400);
		getContentPane().setBackground(Color.YELLOW);
		btnEast = new JButton("East");
		add(btnEast,BorderLayout.EAST);
		btnEast.addActionListener(this);
		
		btnWest = new JButton("West");
		add(btnWest,BorderLayout.WEST);
		btnWest.addActionListener(this);
		
		btnNorth = new JButton("North");
		add(btnNorth,BorderLayout.NORTH);
		btnNorth.addActionListener(this);
		
		btnSouth = new JButton("South");
		add(btnSouth,BorderLayout.SOUTH);
		btnSouth.addActionListener(this);
		
		
		lblCenter = new JLabel();
		add(lblCenter,BorderLayout.CENTER);

		ImageIcon img = new ImageIcon(pics[4]);
		
		Image img1 = img.getImage();
		img1 = img1.getScaledInstance(lblCenter.getWidth(),lblCenter.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon imgNew = new ImageIcon(img1);

		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btnEast)
		{
			lblCenter.setIcon(new ImageIcon(pics[0]));
		}
		else if(ae.getSource()==btnWest)
		{
			lblCenter.setIcon(new ImageIcon(pics[1]));
		}
		else if(ae.getSource()==btnNorth)
		{
			lblCenter.setIcon(new ImageIcon(pics[2]));
		}
		else if(ae.getSource()==btnSouth)
		{
			lblCenter.setIcon(new ImageIcon(pics[3]));
		}
	}
}
public class BorderLayoutDemo {

	public static void main(String[] args) {

			new MyBroderWindow();
	}

}
