package Checked_Exception;

public class Atm {
static void money() throws MoneyException
{
	int amt=100;
	if (amt>=500) {
		System.out.println("Amt withdrawn");
	} else {
    throw new MoneyException("Insufficient amount");
	}
}
public static void main(String[] args) {
	try{
		money();
	}
	catch (MoneyException e) {
		System.out.println(e.getMessage());
	}
}
}
class MoneyException extends Exception
{
	String msg;

	public MoneyException(String msg) {
		this.msg = msg;
	}
	public String getMessage()
	{
		return msg;
	}
}
