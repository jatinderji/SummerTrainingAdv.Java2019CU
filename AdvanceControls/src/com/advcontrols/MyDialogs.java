package com.advcontrols;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyDialogs extends JFrame implements ActionListener
{
	JButton btnBrowse;
	JLabel lblImage;
	JFileChooser fileChooser;
	public MyDialogs() {
		
		setSize(400,300);
		getContentPane().setBackground(Color.gray);
		
		setLayout(null);
		
		btnBrowse= new JButton("Browse");
		btnBrowse.setBounds(50,20,100,25);
		btnBrowse.addActionListener(this);
		add(btnBrowse);
		
		lblImage= new JLabel("Image Here");
		lblImage.setBackground(Color.YELLOW);
		lblImage.setBounds(0,30,400,300);
		
		fileChooser= new JFileChooser();
		
		
		setVisible(true);
		

	}
	@Override
	public void actionPerformed(ActionEvent e) {

		int val = fileChooser.showOpenDialog(this);
		
		if (val == JFileChooser.APPROVE_OPTION)
		{
	        File F= fileChooser.getSelectedFile();
	        System.out.println(F.getAbsolutePath().toString());
	    }
	    else
	    {
	        System.out.println("Nothing selected.");
	    }
		
	}
}
