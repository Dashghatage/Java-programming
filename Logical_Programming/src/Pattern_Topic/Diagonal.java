package Pattern_Topic;

public class Diagonal {
public static void main(String[] args) {
	String s1="DARSHAN";
	for (int i = 0; i < s1.length(); i++) {
		for (int j = 0; j < s1.length(); j++) {
			if (i==j) {
				System.out.println(s1.charAt(j));
			} else {
            System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
