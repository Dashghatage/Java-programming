package practiccc;

public class AlphaFectch1 {
public static void main(String[] args) {
 //AaBCc------Ii
	char ch1='A';
	char ch2='a';
	int j=9;
	for (int i = 1; i <=9; i++) {
		System.out.print(ch1+""+j+""+ch2+" ");
		ch1++;
		ch2++;
		j--;
	}
}
}
