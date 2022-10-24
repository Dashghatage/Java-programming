package Alphbet_pattern;

public class G {
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter nummber of lines");
		//int n=sc.nextInt();
		int n=5;
		for (int i = 1; i <=n; i++) {
			for(int j=1;j<=n;j++)
			{
				if(j==1 || i==1 || i==n || (i>n/2 && j==n) || (i==(n/2+1) && j>n/2)){
					System.out.print("*");
				} else {
	             System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
