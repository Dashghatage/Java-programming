package Reve_String;

public class ReString {
	public static void main(String[] args) {
		String s1="DASH";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			char ch1=s1.charAt(i);
			        s2=s2+ch1;
			        
		}
		System.out.println(s2);
	}

}
