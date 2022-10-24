package Checked_Exception;

public class Icecream {
static void buy() throws IceException
{
	int amt=50;
	if (amt>=20) {
		System.out.println("You will get icecream");
	} else {
     throw new IceException("you will not get icecream");
	}
}
public static void main(String[] args) {
	try {
		buy();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}

}
class IceException extends Exception
{
	String msg;

	public IceException(String msg) {
		super();
		this.msg = msg;
	}
	public String getMessage() {
		return msg;
	}
}
