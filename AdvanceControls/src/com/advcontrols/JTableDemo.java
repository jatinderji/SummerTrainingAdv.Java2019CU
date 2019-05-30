package com.advcontrols;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.table.DefaultTableModel;

public class JTableDemo extends JFrame implements ActionListener
{
	JPanel p1,p2;
	JLabel lblRollno,lblName;
	JTextField txtRollno,txtName;
	JButton btnAdd;
	JTable table;
	DefaultTableModel model;
	Object headers[] = { "Sr. No.","Rollno", "Name" };

	JTableDemo()
	{
		setSize(500,300);
		setTitle("JTable Demo");
		setLayout(null);
		
		p1 = new JPanel();
		p1.setBounds(0,5,getWidth(),40);
		p1.setBackground(Color.LIGHT_GRAY);
		p1.setLayout(new FlowLayout());
		add(p1);
		
		lblRollno = new JLabel("Rollno");
		p1.add(lblRollno);
		
		txtRollno = new JTextField(8);
		p1.add(txtRollno);
		
		lblName = new JLabel("Name");
		p1.add(lblName);
		
		txtName = new JTextField(8);
		p1.add(txtName);

		
		btnAdd = new JButton("Add");
		p1.add(btnAdd);
		btnAdd.addActionListener(this);
		
		p2 = new JPanel();
		p2.setBounds(0,51,getWidth(),getHeight()-(p1.getHeight()+10));
		p2.setBackground(Color.WHITE);
		p2.setLayout(new FlowLayout());
		
		// Getting Model Ready
		model = new DefaultTableModel(null,headers);
		
		
		table = new JTable(model);
		
		
		// Making JTable scrollable
		JScrollPane sp = new JScrollPane(table);
		
		// setting max size of JTable
		sp.setPreferredSize(new Dimension(p2.getWidth()-200, p2.getHeight()-80));
		p2.add(sp);
		
		
		add(p2);
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);	
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		int srno = model.getRowCount()+1;
		String name = txtName.getText();
		String rollno = txtRollno.getText();
		Object ob[]= { srno,name,rollno};
		
		model.addRow(ob);
	}
}
