package com.swinguis;


import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;

class MyControls extends JFrame
{
	JTextArea txtAddress;
	JCheckBox chbMovie,chbReading,chbSwimming;
	JRadioButton chbMale,chbFemale,chbOther;
	ButtonGroup btnGrp;
	ButtonGroup btnGender;
	JComboBox<String> cities;
	JList courses;
	String citynames[]= {"Chandigarh","Ludhiana","Kharar","Jalandhar"};
	String courseNames[]= {"C","C++","Java","Python","Android","Swift"};
	JLabel lbl;
	JButton btn;
	JPanel panel;
	
	public MyControls()
	{
		setSize(350,380);
		setTitle("Controls");
		setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
		
		getContentPane().setBackground(Color.YELLOW);
		
		
		btn = new JButton("Submit");
		add(btn);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(chbMale.isSelected())
					chbMale.setVisible(false);
				else if(chbFemale.isSelected())
					chbFemale.setVisible(false);
				else if(chbOther.isSelected())
					chbOther.setVisible(false);
			}
		});
		lbl = new JLabel("Simple Label");
		add(lbl);
		lbl.setForeground(Color.blue);
	
		lbl.setOpaque(true);
		
		lbl.setBackground(Color.GREEN);
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(3, 1));
		panel.setBackground(Color.CYAN);
		panel.setOpaque(true);
		chbMovie = new JCheckBox("Movies");
		panel.add(chbMovie);

		chbReading = new JCheckBox("Reading");
		panel.add(chbReading);
		
		chbSwimming = new JCheckBox("Swimming");
		panel.add(chbSwimming);

		add(panel);
		
		btnGender = new ButtonGroup();
		
		chbMale = new JRadioButton("Male");
		btnGender.add(chbMale);
		add(chbMale);
		
		chbFemale= new JRadioButton("Female");
		btnGender.add(chbFemale);
		add(chbFemale);
		
		chbOther = new JRadioButton("Other");
		btnGender.add(chbOther);
		add(chbOther);
		
		cities = new JComboBox<>(citynames);
		add(cities);		
		
		courses = new JList<>(courseNames);
		courses.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(courses);
		

		txtAddress = new JTextArea(5, 20);
		txtAddress.setLineWrap(true);
		txtAddress.setAutoscrolls(true);
		add(txtAddress);
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
}
public class Controls
{
	public static void main(String[] args) {
		
		new MyControls();
	}
}
