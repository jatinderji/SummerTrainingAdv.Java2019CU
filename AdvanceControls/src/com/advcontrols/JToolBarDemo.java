package com.advcontrols;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class JToolBarDemo extends JFrame implements ActionListener
{
	JToolBar toolBar;
	JButton btnNew,btnDelete,btnLock,btnHide;
	JTextField txtSearch;
	JLabel status;
	
	JToolBarDemo()
	{
	setSize(600,450);
	setTitle("Toolbar Demo");
	setLayout(new BorderLayout());
	
	toolBar = new JToolBar();
		
		btnNew = new JButton(new ImageIcon("pics/adduser.png"));
		toolBar.add(btnNew);

		btnDelete = new JButton(new ImageIcon("pics/deleteuser.png"));
		toolBar.add(btnDelete);
		
		toolBar.addSeparator();
		
		txtSearch = new JTextField("Search...",10);
		txtSearch.setForeground(Color.GRAY);
		toolBar.add(txtSearch);
		
		toolBar.addSeparator();

		btnLock = new JButton("Lock");
		toolBar.add(btnLock);
		btnLock.addActionListener(this);
		
		btnHide = new JButton("X");
		toolBar.add(btnHide);
		btnHide.addActionListener(this);
				
	add(toolBar,BorderLayout.NORTH);
	
	status = new JLabel("Welcome of xYz Corporations... for feedback email: jatinder.verma6@gmail.com");
	status.setHorizontalAlignment(JLabel.CENTER);
	status.setOpaque(true);
	status.setForeground(Color.BLACK);
	status.setBackground(Color.WHITE);	
	add(status, BorderLayout.SOUTH);
	
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
	setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==btnLock)
		{
			if(toolBar.isFloatable())
				{
				toolBar.setFloatable(false);
				btnLock.setText("Un-Lock");
				}
			else
				{
				toolBar.setFloatable(true);
				btnLock.setText("Lock");
				}
		}
		else if(ae.getSource()==btnHide)
		{
			JOptionPane.showMessageDialog(JToolBarDemo.this, "You need to restart app to see the toolbar again.");
			toolBar.setVisible(false);
		}
		}
		
}
