package Alphbet_pattern;

public class Z {
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter nummber of lines");
		//int n=sc.nextInt();
		int n=5;
		for (int i = 1; i <=n; i++) {
			for(int j=1;j<=n;j++)
			{
				if(i==1 || i==n || j==n-i+1){
					System.out.print("*");
				} else {
	             System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
}
