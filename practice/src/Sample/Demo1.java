package Sample;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		int b=s1.nextInt();
		int c=a+b;
		System.out.println(c);
		
	}

}
