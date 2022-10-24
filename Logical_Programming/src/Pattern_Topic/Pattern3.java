package Pattern_Topic;

public class Pattern3 {
public static void main(String[] args) {
	for (int i = 1; i <=4; i++) {
		for (int j = 1; j <=4; j++) {
			if (i>=j) {
				System.out.print("*");
			}
			System.out.print(" ");
		}
		System.out.println();
	}
	for (int i = 3; i >=1; i--) {
		for (int j = i; j >=1; j--) {
			if(i>=j)
			{
				System.out.print("*");
			}
			System.out.print(" ");
		}
		System.out.println();
			
}
}
}
