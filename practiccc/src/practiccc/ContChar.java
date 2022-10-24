package practiccc;

import java.util.Scanner;

public class ContChar {
public static void main(String[] args) {
	String s1="javaissuper";
	int count=0;
	for (int i = 1; i <s1.length()-1; i++) {
		char ch=s1.charAt(i);
		if ((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')) {
			count++;
			System.out.println("ok");
		}else{
			System.out.println("bad");
		}
	}
	System.out.println("Total count: "+count);
	
	
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter string");
//	String s1=sc.nextLine();
//	int count=0;
//	for (int i = 1; i <s1.length()-1; i++) {
//		char ch=s1.charAt(i);
//		if ((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')) {
//			count++;
//		}
//	}
//	System.out.println("Total count vowels: "+count);
//}
}
}
	