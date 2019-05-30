package com.jatin;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class MyWindow extends Frame implements ActionListener
{
	Label lblFirst,lblSecond,lblResult;
	TextField txtOne,txtTwo;
	Checkbox chbOne,chbTwo;
	Button btnAdd,btSubtract;
	
	MyWindow()
	{
		setTitle("My AWT Window");
		setSize(400, 300);
		setLayout(null);
		
		lblFirst = new Label("1st Number");
		lblFirst.setBounds(50, 100, 100, 20);
		add(lblFirst);

		lblSecond = new Label("2nd Number");
		lblSecond.setBounds(50, 130, 100, 20);
		add(lblSecond);
		
		txtOne = new TextField();
		txtOne.setBounds(160, 100, 100, 20);
		add(txtOne);
		
		chbOne = new Checkbox("Mandatory");
		chbOne.setBounds(270, 100, 100, 20);
		add(chbOne);
		
		txtTwo = new TextField();
		txtTwo.setBounds(160, 130, 100, 20);
		add(txtTwo);
		
		btnAdd = new Button("+");
		btnAdd.setBounds(50, 155, 20, 20);
		add(btnAdd);
		btnAdd.addActionListener(this);
		
		setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btnAdd)
		{
			if(chbOne.getState())
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
		else if(ae.getSource()==btSubtract)
		{
			int sum = Integer.parseInt(txtOne.getText())-
					Integer.parseInt(txtTwo.getText());
			lblResult.setText("Result: "+sum);	
		}
		
	//	System.err.println(chbOne.getState());
			
	}

}

public class TestWindow {

	public static void main(String[] args) {
		
		MyWindow w =new MyWindow();

	}

}
