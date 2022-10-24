package Advance_java;
import java.sql.*;
import java.util.*;
public class EWIT {
public static void main(String[] args) throws Exception {
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
	//data base creation
	//PreparedStatement pt=con.prepareStatement("create database college");
	//pt.execute();
	//create a table
 // PreparedStatement pt=con.prepareStatement("create table EWIT(Name varchar(30) not null,usn varchar(10) primary key,Phonenumber bigint unique,city varchar(20),cgpa double )");
  // pt.execute();
	Scanner sc=new Scanner(System.in);
	boolean flag=true;
	while(flag){
		System.out.println("***College EWIT***");
		System.out.println("1.Add Student");
		System.out.println("2.Fetch the Student by usn");
		System.out.println("3.Rusticate student by usn");
		System.out.println("4.Fetch all the student details");
		System.out.println("5.Modify the phone number by taking usn");
		System.out.println("6.Exist");
		System.out.println("Enter the option");
		
		switch(sc.nextInt()){
		case 1:{
			System.out.println("Enter the name");
			String name=sc.next();
			System.out.println("Enter the usn");
			String usn=sc.next();
			System.out.println("Enter the phone number");
			long no=sc.nextLong();
			System.out.println("Enter the city");
			String city=sc.next();
			System.out.println("Enter the cgpa");
			double cgpa=sc.nextDouble();
			PreparedStatement pt=con.prepareStatement("insert into ewit values(?,?,?,?,?)");
			pt.setString(1, name);
			pt.setString(2, usn);
			pt.setLong(3, no);
			pt.setString(4, city);
			pt.setDouble(5, cgpa);
			pt.executeUpdate();
		}
		   break;
		case 2:{
			System.out.println("Enter the usn");
			String usn=sc.next();
			PreparedStatement pt=con.prepareStatement("select * from ewit where usn=?");
			pt.setString(1, usn);
			ResultSet rs=pt.executeQuery();
			rs.next();
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getLong(3)+" "+rs.getString(4)+" "+rs.getDouble(5));
			System.out.println("*****************************************************");
		}
		  break;
		case 3:{
			System.out.println("Enter the usn");
			String usn=sc.next();
			PreparedStatement pt=con.prepareStatement("delete  from ewit where usn=?");
			pt.setString(1, usn);
			pt.executeUpdate();
			System.out.println("*******************************************************");
		}
		break;
		case 4:{
			PreparedStatement pt=con.prepareStatement("select * from ewit");
			ResultSet rs=pt.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getLong(3)+" "+rs.getString(4)+" "+rs.getDouble(5));
			}
			System.out.println("********************************************************");
		}
		    break;
		case 5:{
			System.out.println("enter the usn");
			String usn=sc.next();
			System.out.println("enter the new phone number");
			long no=sc.nextLong();
			PreparedStatement pt=con.prepareStatement("update ewit set phonenumber=? where usn=?");
			pt.setLong(1, no);
			pt.setString(2, usn);
			pt.executeUpdate();
			System.out.println("************************************************************");
		}
		    break;
		case 6:{
			con.close();
			flag=false;
			System.out.println("**Thank you**");		
		}
		    break;
		    default:{
		    	System.out.println("Invalid Option");
		    }
		}
		
	}
}
}
