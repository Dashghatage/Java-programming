package finding_no;

public class FizzBuzz {
	public static void main(String[] args) {
		int a=30;
		if((a%3==0)&&(a%5==0))
		{
			System.out.println("fizz buzz");
		}else if(a%3==0){
			System.out.println("fizz fizz");
		}else if(a%5==0){
			System.out.println("buzz buzz");
		}
	}

}
