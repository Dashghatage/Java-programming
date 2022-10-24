package Exception_prog;

public class Tester1 {
public static void main(String[] args) {
	System.out.println("***Main Starts***");
	try
	{
		int i=1/0;
	}
	catch(ArithmeticException e)
	{
		int[]arr={10,20,30};
		try
		{
			System.out.println(arr[8]);
		}
		catch(ArrayIndexOutOfBoundsException a1)
		{
			System.out.println("handled");
		}
		System.out.println("**Main ends**");
	}
}
}
