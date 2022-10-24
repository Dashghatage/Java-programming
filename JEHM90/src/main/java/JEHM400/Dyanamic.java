package JEHM400;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dyanamic {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sunday25","root","root");
		 //PreparedStatement pt=con.prepareStatement("create database Sunday25");
		//PreparedStatement pt=con.prepareStatement("create table Student1(Name varchar(45) primary key,id integer,gender varchar(7),phonenumber bigint not null,Address varchar(25)");
		 //PreparedStatement pt=con.prepareStatement("insert into Teacher values('Darshan',18161,'Male',90757035,'Kolhapur')");
		 //PreparedStatement pt=con.prepareStatement("insert into Teacher values('Sameer',18162,'Male',90757036,'Banglore')");
		 //PreparedStatement pt=con.prepareStatement("insert into Teacher values('Vikas',18163,'Male',90757037,'Karnataka')");
		 //PreparedStatement pt=con.prepareStatement("insert into Teacher values('Shantanu',18164,'Male',90757038,'pune')");
		 PreparedStatement pt=con.prepareStatement("insert into Teacher values('Ramesh',18165,'Male',90757039,'Kolhapur')");
		 ResultSet rs=pt.executeQuery("select distinct from Teacher");
		 while(rs.next())
		 {
			 System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));
		 }
		pt.execute();
		System.out.println("Done");
		con.close();
	}
}
