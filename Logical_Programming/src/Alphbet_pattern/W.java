package Alphbet_pattern;

public class W {
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter nummber of lines");
		//int n=sc.nextInt();
		int n=5;
		int x=n;
		for (int i = 1; i <=n; i++) {
			for(int j=1;j<2*n;j++)
			{
				if(j==1 || j==2*n-1 || j==x || j==2*n-x){
					System.out.print("*");
				} else {
	             System.out.print(" ");
				}
			}
			System.out.println();
			x--;
		}
	}
}
