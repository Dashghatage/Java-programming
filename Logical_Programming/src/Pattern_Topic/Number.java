package Pattern_Topic;

public class Number {
public static void main(String[] args) {
	for (int i = 1; i <=5; i++) {
		int x=1;
		for(int j=5;j>=1;j--)
		{
			if (i>=j) {
				System.out.print(x);
				x++;
			} else {
             System.out.print(" ");
			}
		}
		System.out.println();
	}
	
}
}
