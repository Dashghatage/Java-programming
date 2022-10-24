package Exception_prog;

public class Example {
public static void main(String[] args) {
	try{
		String pwd="123@ab";
		if(pwd.equals("123@ab"))
		{
			int i=1/0;
		}
	}
	catch(ArithmeticException e)
	{
		try{
			int otp=80;
			if(otp==97)
			{
				System.out.println("Successful Login");
			}else{
				int i=1/0;
			}
		}
		catch(ArithmeticException a1)
		{
			System.out.println("Login Failed");
		}
	}
}
}
