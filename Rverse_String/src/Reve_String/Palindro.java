package Reve_String;

public class Palindro {
	public static void main(String[] args)
	{
		String s1="DAD";
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
