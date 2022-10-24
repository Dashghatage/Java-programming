package Alphbet_pattern;

import java.util.Scanner;

public class V {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter nummber of lines");
//		int n=sc.nextInt();
		int n=5;
		int x=1;
		for (int i = 1; i <=n; i++) {
			for(int j=1;j<2*n;j++)
			{
				if(j==x || j==2*x-x){
					System.out.print("*");
				} else {
	             System.out.print(" ");
				}
			}
			System.out.println();
			n++;
		}
	}
}
