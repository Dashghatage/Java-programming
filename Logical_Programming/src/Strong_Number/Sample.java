package Strong_Number;

import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter number:");
	    int no=sc.nextInt();
	    int copy=no;
	    int sum=0;

	    while(no!=0)
	    {
	    	int rem=no%10;
	    	int fact=1;
	    	for (int i =rem; i>=1; i--) {
				fact=fact*i;	
			}
	    	sum=sum+fact;
			no=no/10;
	    }
	    if(sum==copy) {
			System.out.println("this is strong number");
		} else {
	     System.out.println("this is not strong number");
		}
	}
}
