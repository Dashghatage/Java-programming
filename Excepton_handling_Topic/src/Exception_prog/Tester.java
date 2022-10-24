package Exception_prog;

public class Tester {
public static void main(String[] args) {
	System.out.println("***Main Starts***");
	Sample s2=null;
	try
	{
		System.out.println(s2.hashCode());
	}
	catch(NullPointerException e)
	{
		System.out.println("Caught");
	}
	System.out.println("***Main Ends***");
}
}
