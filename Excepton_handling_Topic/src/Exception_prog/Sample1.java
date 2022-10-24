package Exception_prog;

public class Sample1 {
public static void main(String[] args) {
	System.out.println("***Main Starts***");
	try
	{
		int i=8/0;
		int[]arr={10,20,30};
		try{
			System.out.println(arr[i]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("handled");
		}
	}
	catch(Exception e)
	{
		System.out.println("caught");
	}
	System.out.println("***Main Ends***");
}
}
