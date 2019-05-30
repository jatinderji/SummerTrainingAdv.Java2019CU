package com.advcontrols;

import java.awt.FlowLayout;
import java.awt.LinearGradientPaint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

class JListMVC extends JFrame implements ActionListener
{
	JList<String> myList;
	JTextField txtItem;
	JButton btnAdd,btnDelete;
	DefaultListModel<String> myModel;
	public JListMVC()
	{
		setSize(290,400);
		setTitle("Adding to JList");
		getContentPane().setLayout(new FlowLayout());
				
		txtItem = new JTextField(10);
		add(txtItem);
		
		btnAdd = new JButton("Add");
		add(btnAdd);
		btnAdd.addActionListener(this);
		
		btnDelete= new JButton("Remove");
		add(btnDelete);
		btnDelete.addActionListener(this);
		
		
		myModel= new DefaultListModel<>();
		
		myList=new JList<String>(myModel);
		myList.setBorder(new TitledBorder("Colors"));
		myList.setFixedCellWidth(150);
		add(myList);

		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btnAdd)
		{
			myModel.addElement(txtItem.getText());
			txtItem.setText("");
			txtItem.requestFocus();
		}
		else if(ae.getSource()==btnDelete)
		{
			int selected[]=myList.getSelectedIndices();
			
			String items[]=new String[selected.length];
			
			for(int i=0;i<selected.length;i++)
			{
				items[i]= new String(myModel.getElementAt(selected[i]));
			}
			
			for(String item:items)
			{
				myModel.removeElement(item);
			}
			//myModel.removeElement(items);
		}
		
	}	
}
