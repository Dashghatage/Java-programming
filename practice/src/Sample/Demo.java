package Sample;
import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		String str="KA-09-F1212";
		char[] c=str.toCharArray();
		int sum=0;
		int sum1=0;
		for (int i = 0; i < c.length; i++) {
			if (Character.isDigit(c[i])) {
				int a=Integer.parseInt(String.valueOf(c[i]));
				sum=sum+a;
			}
		} 
		while(sum!=0)
		{
			int rem=sum%10;
			sum1=sum1+rem;
			sum=sum/10;
		}
		System.out.println("sum of digit is "+sum1);
}
}



