package Exception_prog;

public class Sample {
public static void main(String[] args) {
	System.out.println("***Main Starts***");
	try
	{
		int i=1/0;
		
	}
	catch(ArithmeticException e)
	{
		System.out.println("handled");
	}
	System.out.println("***Main Ends***");
}
}
