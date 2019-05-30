package com.databasedemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExecuteMethodDemo
{
	
	public static void main(String[] args) throws SQLException
	{
		boolean b = false;
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jvdb","root","1234");
		String q = "select * from users";
		//"insert into users values('ok1','ok1')";
			
		PreparedStatement pst = con.prepareStatement(q);			
				
				b = pst.execute();
				if(b)
				{
					ResultSet rs = pst.getResultSet(); 
					
					while(rs.next())
					{
System.out.println(rs.getString(1)+"\t\t"+rs.getString(2));
					}
				}
				else
				{
					int rows = pst.getUpdateCount();
					System.out.println(rows+" row(s) affected.");
				}
				
//				ResultSet rs = st.executeQuery("select * from tb");
				/*
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3));
				}*/
	}
		
}
