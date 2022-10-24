package Reve_String;
// write a programe  riverse string
import java.util.Scanner; //Dynamic input taking input from user

public class paliin {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			char ch1=s1.charAt(i);
			s2=s2+ch1;
		}if(s1.equals(s2)){
			System.out.println("it is palindrome");
		}else{
			System.out.println("it is not palindrome");
		}
		          
	}

}
