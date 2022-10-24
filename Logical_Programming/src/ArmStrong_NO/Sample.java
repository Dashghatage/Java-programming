package ArmStrong_NO;

import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter no:");
	    int no=sc.nextInt();
	    int copy=no;
	    int sum=0;
	    int i=1;
	    while (i<=no/2) {
			if(no%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
	    if (sum==copy) {
			System.out.println("this is perfect no: "+copy);
		} else {
	     System.out.println("Not perfect no: "+copy);
		}
	}
}
