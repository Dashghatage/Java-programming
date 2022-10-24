package PrimeNo;

public class RangePrime {
public static void main(String[] args) {
	for (int i = 2; i <=100; i++)
	{
		int no=i;
		boolean flag=true;
		for(int j=2;j<no;j++)
		{
			if(no%j==0)
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("it is prime no "+no);
		}else{
			System.out.println("it is not prime no "+no);
		}
	}
	  
}
}
