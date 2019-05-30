package com.advcontrols;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

class JlistOnetoJListTwo extends JFrame implements ActionListener
{
	JPanel p1,p2,p3;
	JButton btnAdd,btnRemove,btnColor;
	JList oldList,newList;
	TitledBorder border1,border2;
	DefaultListModel oldItemsModel,newItemsModel;
	public JlistOnetoJListTwo() {
		
		setSize(400, 400);
		setTitle("JList Items Shifting");
		getContentPane().setBackground(Color.yellow);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(1,3));
		
		p1=new JPanel();
		p1.setLayout(new GridLayout(1, 1));
		border1= new TitledBorder("All Items");
		p1.setBorder(border1);
		
		 
		String items[]= {"Item 1","Item 2","Item 3","Item 4","Item 5","Item 6"};
		oldItemsModel= new DefaultListModel<String>();
		for(int i=0;i<items.length;i++)
		{
			oldItemsModel.addElement(items[i]);
		}
		oldList= new JList(oldItemsModel);
		p1.add(oldList);
		add(p1);

 		p2=new JPanel();
		 	btnAdd= new JButton("Add>>");
		 	p2.add(btnAdd);
			btnRemove= new JButton("<<Remove");
			p2.add(btnRemove);
			btnColor= new JButton("Change Color");
			p2.add(btnColor);
				btnColor.addActionListener(this);
				btnAdd.addActionListener(this);
				btnRemove.addActionListener(this);
		add(p2);
		
		p3=new JPanel();
		p3.setLayout(new GridLayout(1, 1));
		border2= new TitledBorder("Selected Items");
		border2.setTitleJustification(TitledBorder.CENTER);
		p3.setBorder(border2);

		newItemsModel= new DefaultListModel<String>();
		newList= new JList<String>();
		p3.add(newList);
		add(p3);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}
	
	public void addItems()
	{
		int[] selected = oldList.getSelectedIndices();
		String se[]= new String[selected.length];
		
		for(int i=0;i<selected.length;i++)
		{
		  newItemsModel.addElement(oldItemsModel.getElementAt(selected[i]));
		  String ce=oldItemsModel.getElementAt(selected[i]).toString();
		  se[i]=new String(ce);
		}
		newList.setModel(newItemsModel);
	removeItems(se);
	}
	
	public void removeItems(String selectedElements[])
	{
		for(int i=0;i<selectedElements.length;i++)
		{
			oldItemsModel.removeElement(selectedElements[i]);
		}	
	}

	
	@Override
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btnAdd)
		{
			addItems();
		}
		else if(ae.getSource()==btnRemove)
		{
			rollAddItems();
		}
		else if(ae.getSource()==btnColor)
		{
			Color choosedColor= JColorChooser.showDialog(this,
					"Select a color", Color.GREEN);
			p2.setBackground(choosedColor);
		}
	}
	
	public void rollAddItems()
	{
		int[] selected = newList.getSelectedIndices();
		String se[]= new String[selected.length];
		
		for(int i=0;i<selected.length;i++)
		{
		  oldItemsModel.addElement(newItemsModel.getElementAt(selected[i]));
		  String ce=newItemsModel.getElementAt(selected[i]).toString();
		  se[i]=new String(ce);
		}
		oldList.setModel(oldItemsModel);
	rollRemoveItems(se);
	}

	public void rollRemoveItems(String selectedElements[])
	{
		for(int i=0;i<selectedElements.length;i++)
		{
			newItemsModel.removeElement(selectedElements[i]);
		}	
	}
	
}