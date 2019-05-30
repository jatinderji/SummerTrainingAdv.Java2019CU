package com.advcontrols;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;

import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;


public class JMenus extends JFrame implements ActionListener
{
	JMenuBar menuBar;
	
	JMenu menuFile,menuColors;
	
	JMenuItem fNew,fSave,fSaveAs,fClose,fCloseAll,fExit;
	
	JMenuItem fYellow,fGreen,fCyan,fRed,fWhite;
	JDesktopPane desktopPane;	
	JMenus()
	{
		setSize(500,300);
		setTitle("Menus Demo");
		

		desktopPane = new JDesktopPane();
	    getContentPane().add(desktopPane);
		
		menuBar = new JMenuBar();
		
			menuFile = new JMenu("File");
			menuFile.setMnemonic('F');
				
				fNew = new JMenuItem("New",new ImageIcon("pics/adduser.png"));
				menuFile.add(fNew);

			menuFile.addSeparator();
				
				fSave = new JMenuItem("Save");
				menuFile.add(fSave);
				fSave.addActionListener(this);
				
				fSaveAs = new JMenuItem("Save As");
				menuFile.add(fSaveAs);
				fSaveAs.addActionListener(this);
				
			menuFile.addSeparator();
				
				fClose = new JMenuItem("Close");
				fClose= new JMenuItem("Close",new ImageIcon("pics/deleteuser.png"));
				menuFile.add(fClose);
				
				fCloseAll = new JMenuItem("Close All");
				menuFile.add(fCloseAll);
				
			menuFile.addSeparator();
				
				fExit = new JMenuItem("Exit");
				fExit.addActionListener(this);
				menuFile.add(fExit);
				
	
			menuBar.add(menuFile);
			
			menuColors = new JMenu("Color");
			menuColors.setMnemonic('C');
						
			fYellow = new JMenuItem("Yellow");
			menuColors.add(fYellow);
fYellow.setAccelerator(KeyStroke.getKeyStroke('Y',InputEvent.CTRL_MASK));
			fYellow.addActionListener(this);

			fGreen = new JMenuItem("Green");
fGreen.setAccelerator(KeyStroke.getKeyStroke('G',InputEvent.CTRL_DOWN_MASK));
			menuColors.add(fGreen);
			fGreen.addActionListener(this);
			
			fCyan = new JMenuItem("Cyan");
			fCyan.setAccelerator(KeyStroke.getKeyStroke('C',InputEvent.CTRL_DOWN_MASK));
			menuColors.add(fCyan);
			fCyan.addActionListener(this);
			
			fRed = new JMenuItem("Red");
			menuColors.add(fRed);
			
			fWhite = new JMenuItem("Custom");
			menuColors.add(fWhite);
			fWhite.addActionListener(this);
			
			menuBar.add(menuColors);
		
		add(menuBar,BorderLayout.NORTH);

	
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		setVisible(true);	
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource().equals(fYellow))
		{
			getContentPane().setBackground(Color.YELLOW);
		}
		else if(e.getSource().equals(fGreen))
		{
			getContentPane().setBackground(Color.GREEN);
		}
		else if(e.getSource().equals(fCyan))
		{
			getContentPane().setBackground(Color.CYAN);
		}
		else if(e.getSource().equals(fExit))
		{
			int userchoice = JOptionPane.showConfirmDialog(this, "Do you really want to leave me?");
			
			if(userchoice==JOptionPane.YES_OPTION)
				dispose();
		}
		else if(e.getSource().equals(fSave))
		{
			String a = JOptionPane.showInputDialog("Enter your age");
			JOptionPane.showMessageDialog(this,"You are "+a+ " years old");
		}
		else if(e.getSource().equals(fWhite))
		{
			Color c = JColorChooser.showDialog(this, "Which Color background you want", Color.YELLOW);
			if(c!=null)
				desktopPane.setBackground(c);
		}
		else if(e.getSource().equals(fSaveAs))
		{																
	JInternalFrame frame = new JInternalFrame("New..",true,true,true,true);
	        frame.setSize(200,200);
	        frame.setVisible(true);
	        desktopPane.add(frame);
		}
	}
}
