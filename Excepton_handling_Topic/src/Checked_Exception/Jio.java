package Checked_Exception;

public class Jio {
static void purchase() throws BalanceException
{
	int amt=240;
	if (amt>=100) {
		System.out.println("Recharge your mobile");
	} else {
     throw new BalanceException("You can't recharge your mobile");
	}
}
public static void main(String[] args) {
	try {
		purchase();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
}
class BalanceException extends Exception
{
	String msg;

	public BalanceException(String msg) {
		super();
		this.msg = msg;
	}
	public String geMessage()
	{
		return msg;
	}
}
