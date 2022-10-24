package practiccc;

import java.util.Scanner;
public class SwitchCase {
	static void add()
	{
		int a=10;
		int b=20;
		
		int res=a+b;
		System.out.println(res);
	}
	static void mul()
	{
		int b=25;
		int d=30;
		int res=b*d;
		System.out.println(res);
	}
	static void sub()
	{
		int x=10;
		int y=5;
		int res=x-y;
		System.out.println(res);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the option:");
		int input=sc.nextInt();
		switch (input) {
		case 1:add();
		
			break;
		case 2:mul();
		
		break;
		case 3:sub();
		
		break;
       
		default:System.out.println("invalid option");
			break;
		}
	}
}