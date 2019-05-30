package com.databasedemo;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Connection;

public class Test
{

	public static boolean isValidUser(String em,String pass) throws SQLException
	{
	// username'OR 1=1'	
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jvdb","root","1234");
PreparedStatement pst = con.prepareStatement("select * from users where email=? AND pass=?");
		
		pst.setString(1, em);
		pst.setString(2, pass);
	
		ResultSet rs = pst.executeQuery();
			if(rs.next())
			{
			con.close();
			return true;
			}
			else
			{
			con.close();
			return false;
			}
	
//		ResultSet rs = st.executeQuery("select * from tb");
		/*
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3));
		}*/
	}

}
