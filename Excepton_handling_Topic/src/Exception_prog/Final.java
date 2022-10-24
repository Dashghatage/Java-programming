package Exception_prog;

public class Final {
public static void main(String[] args) {
	try
	{
		int i=1/0;
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("handled");
	}
	finally
	{
		System.out.println("i am finally block....");
	}
}
}
