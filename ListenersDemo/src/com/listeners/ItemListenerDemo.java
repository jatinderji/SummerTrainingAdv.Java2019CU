package com.listeners;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ItemListenerDemo extends JFrame implements ItemListener
{
	JLabel lbl;
	String ColorNames[]= {"Red","Yellow","Green"};
	JComboBox colors;
	ItemListenerDemo()
	{
	
		setSize(400,200);
		setTitle("ItemListener Demo");
		setLayout(new FlowLayout());
		
		lbl = new JLabel("Nothing Selected yet");
		add(lbl);
		
		colors = new JComboBox<>(ColorNames);
		add(colors);
		colors.addItemListener(this);
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}
	@Override
	public void itemStateChanged(ItemEvent e)
	{
		
		if(colors.getSelectedItem().toString().equals("Red"))
			getContentPane().setBackground(Color.RED);
		else if(colors.getSelectedItem().toString().equals("Green"))
			getContentPane().setBackground(Color.GREEN);
		
	}

}
