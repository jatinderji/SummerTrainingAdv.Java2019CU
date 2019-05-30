package com.databasedemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ResultSetMetaDataDemo
{

	public static void main(String[] args) throws SQLException
	{
		boolean b = false;
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jvdb","root","1234");
		String q = "select * from users";
			
		PreparedStatement pst = con.prepareStatement(q);			
		
		ResultSet rs = pst.executeQuery();
		ResultSetMetaData rsmd= rs.getMetaData();
		System.out.println("--------------------------------------------------------");
		System.out.print("Sr.no.\t|\t");
		for(int i=1;i<=rsmd.getColumnCount();i++)
		{
			System.out.print(rsmd.getColumnLabel(i)+"("+rsmd.getColumnTypeName(i)+")\t\t|\t");
		}
		
	System.out.println();
	System.out.println("--------------------------------------------------------");
		int sr=1;
		while(rs.next())
		{
			System.out.print(sr+"\t|\t");
			System.out.print(rs.getString(1)+"\t|\t");
			System.out.print(rs.getString(2)+"\t\t|\t");
			System.out.println();
			sr++;
		}
		System.out.println("--------------------------------------------------------");
	}
}
