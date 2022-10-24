package Assign_polymorphism;
class Amazon
{
	void Order()
	{
		System.out.println("some order");
	}
}
class Grocery extends Amazon
{
	void Order()
	{
		System.out.println("order Fruits");
	}
}
class Footwear extends Amazon
{
	void Order()
	{
		System.out.println("order shoes");
	}
}
class Electronics extends Amazon
{
	void Order()
	{
		System.out.println("Order Laptop");
	}
}
class Customer1					
{
	static void buy(Amazon a1)
	{
		a1.Order();
	}
}
public class Mainclass3 {
	public static void main(String[] args) {
		Grocery g1=new Grocery();
		Footwear f1=new Footwear();
		Electronics e1=new Electronics();
		Customer1.buy(g1);
		Customer1.buy(f1);
		Customer1.buy(e1);
	}

}
