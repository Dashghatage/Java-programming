package Checked_Exception;
class Amazon
{
	static void order() throws OrderException
	{
		int amt=500;
		if (amt>=100) {
			System.out.println("you can order");
		}else{
			throw new OrderException("you can't order");
		}
	}
	public static void main(String[] args) {
		try{
			order();
		}
		catch(OrderException e)
		{
			System.out.println(e.getMessage());
		}
	}
	}

class OrderException extends Exception
{
	String msg;

	public OrderException(String msg) {
		super();
		this.msg = msg;
	}
	public String getMessage()
	{
		return msg;
	}
	
}

