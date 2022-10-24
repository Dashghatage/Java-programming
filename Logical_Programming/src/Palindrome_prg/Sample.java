package Palindrome_prg;

public class Sample {
public static void main(String[] args) {
	String s1="dad";
	String s2="";
	for(int i=s1.length()-1;i>=0;i--)
	{
		char ch1=s1.charAt(i);
		s2=s2+ch1;
		
	}
	if (s1.equals(s2)) {
		System.out.println("it is palindrome");
	} else {
     System.out.println("it is not palindrome");
	}
	
}
}
