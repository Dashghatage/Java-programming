package String_Count_Char;

public class Sample {
public static void main(String[] args) {
	String s="java";
	int count=0;
	for (int i = 0; i <=s.length()-1; i++) {
		count=s.charAt(i);
		count++;
	}
	System.out.println(count);
}
}
