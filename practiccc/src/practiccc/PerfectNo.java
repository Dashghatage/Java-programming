package practiccc;

public class PerfectNo {
public static void main(String[] args) {
	int no=28;
	int copy=no;
	int sum=0;
	int i=1;
	while (i<=no/2) {
		if(no%i==0){
			sum=sum+i;
			
		}
		i++;
	}
	if (sum==copy) {
		System.out.println("perfect no");
	} else {
     System.out.println("not perfect");
	}
}
}
