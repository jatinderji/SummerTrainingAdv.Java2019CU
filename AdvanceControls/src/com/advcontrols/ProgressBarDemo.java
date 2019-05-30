package com.advcontrols;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBarDemo extends JFrame implements ActionListener
{
	JButton btnStart;
	JProgressBar pb;
	
	ProgressBarDemo()
		{
		setSize(300,150);
		setTitle("Progressbar Demo");
		setLayout(null);
		setUndecorated(true);
	
		pb = new JProgressBar(0,100);
		pb.setBounds(15,50,270,20);
		pb.setStringPainted(true);
		pb.setBackground(Color.WHITE);
		pb.setForeground(Color.MAGENTA);
		add(pb);
		
		btnStart = new JButton("Start");
		btnStart.setBounds(100, 100, 80, 20);
		add(btnStart);
		btnStart.setOpaque(true);
		btnStart.setBackground(Color.yellow);
		
		btnStart.addActionListener(this);
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		}
	public void actionPerformed(ActionEvent arg0) {

		new Thread(new Runnable() {
			
			@Override
			public void run() {
			
				int n = 1;
				while(n<=100)
				{
					pb.setValue(n);
					try {Thread.sleep(50);}
					catch (Exception e) {}
					n++;
				}
		
		new MouseListenerDemo();
			}
		}).start();
				
		
	}

}
