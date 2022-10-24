package Afternoon;
import java.sql.*;
public class Sample {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/monday","root","root");
	Statement st=con.createStatement();
    //System.out.println(st.execute("create database Monday"));
   // st.execute("create table Sample(slno int primary key, Name varchar(10),Salery int)");
    st.execute("insert into Sample values(1,'Sagar',5000)");
    System.out.println("done");
    con.close();
}
}
