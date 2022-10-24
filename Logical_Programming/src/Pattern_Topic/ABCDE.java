package Pattern_Topic;

public class ABCDE {
public static void main(String[] args) {
	for (int i = 1; i <=5; i++) {
		char ch='A';
		for(int j=5;j>=1;j--)
		{
			if (i>=j) {
				System.out.print(ch);
				ch++;
			} else {
             System.out.print(" ");
			}
		}
		System.out.println();
	}
	
}
}
