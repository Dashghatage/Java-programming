package Exception_prog;

public class Demo1 {
public static void main(String[] args) {
	try
	{
		int i=1/0;
		System.out.println("HII");
	}
	catch(Exception e)
	{
		System.out.println("handled");
	}
	
}
}
