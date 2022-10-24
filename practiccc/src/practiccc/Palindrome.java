package practiccc;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
//	String norm="MANOJ";
//	String rev="";
//	for (int i =norm.length()-1;i>=0; i--) {
//		rev=rev+norm.charAt(i);
//	}
//	System.out.println(rev);
//	
//	String s1="MANOJ";
//	String s2="";
//	for (int i =s1.length()-1;i>=0; i--) {
//		s2=s2+s1.charAt(i);		
//	}
//	if (s1.equals(s2)) {
//		System.out.println("palindrome");
//	} else {
//     System.out.println("not palindrome");
//	}
	
//	

//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter the String");
//	String s1=sc.nextLine();
//	String s2="";
//	for (int i =s1.length()-1;i>=0; i--) {
//		s2+=s1.charAt(i);
//	}
//	if (s1.equals(s2)) {
//		System.out.println("it is palindrome");
//	} else {
//     System.out.println("Not palindrome");
//	}
	
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter String");
//	String s1=sc.nextLine();
//	String s2="";
//	for (int i=s1.length()-1;i>=0; i--) {
//		s2+=s1.charAt(i);
//	}
//	System.out.println(s2);
//	
//	
	
//	int no=14241
//			;
//	int copy=no;
//	int sum=0;
//	while (no!=0) {
//		int rem=no%10;
//		sum=(sum*10)+rem;
//		no=no/10;	
//	}
//	if (sum==copy) {
//		System.out.println("palindrome");
//	} else {
//   System.out.println("not Palindrome");
//	}
//	

	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number:");
	int no=sc.nextInt();
	int copy=no;
	int sum=0;
	while (no!=0) {
		int rem=no%10;
		sum=(sum*10)+rem;
		no=no/10;
	}
	if (sum==copy) {
		System.out.println("Number palindrom");
	} else {
  System.out.println("Number not palindrome");
	}
	
	
}
}
