package SarthaLab;

import java.util.ArrayList;
import java.util.Scanner;

public class Sartha {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int no1=sc.nextInt();
      int no2=0;
	  int count=0;
      int res=0;
     ArrayList l1=new ArrayList();
     if(no1==1){
    	 System.out.println("Not a prime number");
     }else{
    	 while(no1>1){
    		 for (int i = 2; i <=no1; i++) {
				int a=0;
				int no3=i;
				for (int j = 2; j < no3; j++) {
					if (no3%j==0) {
						a=1;
						break;
					}
				}
				if (a==0){
					no2=no3;		
				}	
			}
    		 count++;
    		 
    		 l1.add(no2);
    		 no1=no1-no2;
    		 if (no1==1) {
				res++;
				break;
			}
    		 no2=0;
    	 }
    	 System.out.println("Number of Moves:"+count);
    	 System.out.println("Residual:"+res);
    	 System.out.print("Primes:");
    	 for (int i = 0; i < l1.size(); i++) {
			System.out.print(l1.get(i)+" ");
		}
        }    	
}
	
}


     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
  
      
      
