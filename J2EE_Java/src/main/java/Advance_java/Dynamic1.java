package Advance_java;
import java.sql.*;
import java.util.*;
public class Dynamic1 {
public static void main(String[] args) throws SQLException {
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sunday25","root","root");
	Scanner sc=new Scanner(System.in);
	boolean flag=true;
	while (flag){
		System.out.println("1.adding the user \n2 exist");
		switch (sc.nextInt()){
		case 1: {
			System.out.println("Enter the Name");
			String name=sc.next();
			System.out.println("Enter the id");
			int id=sc.nextInt();
			System.out.println("Enter the Gender");
			String gender=sc.next();
			System.out.println("Enter the Number");
			Long number=sc.nextLong();
			System.out.println("Enter the Address");
			String Address=sc.next();
			PreparedStatement pt=con.prepareStatement("insert into Teacher values(?,?,?,?,?)");
			//PreparedStatement pt=con.prepareStatement("delete from teacher where phonenumber=9075;");
			pt.setString(1, name);
			pt.setInt(2, id);
			pt.setString(3, gender);
			pt.setLong(4, number);
			pt.setString(5, Address);
			
			pt.executeUpdate();
		}
		break;
		case 2:{
			System.out.println("***Thank You***");
			flag=false;
		}
		break;
		default:{
			System.out.println("Invalid Operation");
		}
		}
	}
}
}
