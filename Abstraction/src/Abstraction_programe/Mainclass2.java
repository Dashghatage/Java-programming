package Abstraction_programe;
interface Amazon
{
	public void order();
}
class Grocery implements Amazon
{
	 public void order()
	 {
		 System.out.println("buy fruits");
	 }
}
class Footwear implements Amazon
{
	public void order()
	{
		System.out.println("Buy shoes");
	}
}
class Electronics implements Amazon
{
	public void order()
	{
		System.out.println("buy Laptop");
	}
}
class Customer
{
	static void buy(Amazon a1)
	{
		a1.order();
	}
}
public class Mainclass2 {
	public static void main(String[] args) {
		Grocery g1=new Grocery();
		Footwear f1=new Footwear();
		Electronics e1=new Electronics();
		Customer.buy(g1);
		Customer.buy(f1);
		Customer.buy(e1);
	}
}
