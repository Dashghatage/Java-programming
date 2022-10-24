package JEHM400;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Twotables {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rockstar","root","root");
	Statement st=con.createStatement();		
	//st.execute("Create table Employee(ID integer,Name varchar(45),Email_Id varchar(45),Phone_no integer)");
	//st.execute("Create table HR(ID integer,Name varchar(45),Email_Id varchar(45),Phone_no integer)");
	st.execute("insert into Student values(125,'Darshan','dashghatage67@gmail.com',9075703443)");
	System.out.println("Table is Created");
	
}
}
