package PrimeNo;

public class Sample {
public static void main(String[] args) {
	int no=5;
	boolean flag=true;
	for(int i=2;i<no;i++)
	{
		if(no%i==0){
		flag=true;
		break;
	}  }
	if (flag==true) {
		System.out.println("it is Prime no "+no);
	} else {
     System.out.println("it is not prime no "+no);
	}
}
}
