package Dash;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/holiday","root","root");
	//PreparedStatement pt=con.prepareStatement("create database holiday");
//	PreparedStatement pt=con.prepareStatement("create table Sunday(id integer,Name varchar(40),Mobile bigint,Address varchar(40))");
	//PreparedStatement pt=con.prepareStatement("insert into Sunday values(123,'ghjhj',85274196,'sdfghjksdf')");
	//PreparedStatement pt=con.prepareStatement("insert into Sunday values(125,'ghoku',85275888,'sdfghfghyh')");
	PreparedStatement pt=con.prepareStatement("update Sunday set Name='Ram' where id=123");
	ResultSet rs=pt.executeQuery("select* from Sunday");
	while (rs.next()) {
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
	}
	pt.execute();
	System.out.println("Done");
	con.close();
}
}
