package Checked_Exception;

public class Netflix {

	
static void watch() throws NetException
{
	int Pass=240;
	if (Pass>=100) {
		System.out.println("watch movies");
	} else {
     throw new NetException("You can't watch movies");
	}
}
public static void main(String[] args) {
	try {
		watch();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
}
class NetException extends Exception
{
	String msg;

	public NetException(String msg) {
		super();
		this.msg = msg;
	}
	public String getMessage()
	{
		return msg;
	}
}
