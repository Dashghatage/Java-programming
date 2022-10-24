package Alphbet_pattern;

public class k {
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter nummber of lines");
		//int n=sc.nextInt();
		int n=5;
		int x=n/2+1;
		for (int i = 1; i <=n; i++) {
			for(int j=1;j<=n/2+1;j++)
			{
				if(j==1 || j==x){
					System.out.print("*");
				} else {
	             System.out.print(" ");
				}
			}
			if (i<=n/2) {
				x--;
			} else {
             x++;
			}
			System.out.println();
		}
	}
}
