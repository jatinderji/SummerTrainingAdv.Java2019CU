package com.advcontrols;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSliderDemo extends JFrame implements ChangeListener
{
	JSlider s1,s2,s3;
	
	JSliderDemo()
			{
			setSize(300,150);
			setTitle("JSlider Demo");
			setLayout(new FlowLayout());
		
			s1 = new JSlider();
			add(s1);
			s1.setMinimum(0);
			s1.setMaximum(255);
			s1.addChangeListener(this);
			
			s2 = new JSlider();
			add(s2);
			s2.setMinimum(0);
			s2.setMaximum(255);
			s2.addChangeListener(this);
			
			s3 = new JSlider();
			add(s3);
			s3.setMinimum(0);
			s3.setMaximum(255);
			s3.setPaintTicks(true);
			s3.setMinorTickSpacing(10);
			s3.setMajorTickSpacing(100);
			s3.addChangeListener(this);
			
			setLocationRelativeTo(null);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setVisible(true);

			}

	@Override
	public void stateChanged(ChangeEvent e)
	{
		Color c = new Color(s1.getValue(), s2.getValue(), s3.getValue());
		System.out.println(s1.getValue()+", "+ s2.getValue()+","+ s3.getValue());
		getContentPane().setBackground(c);
	}

}
