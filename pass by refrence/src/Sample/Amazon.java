package Sample;
class Amazon
{
	void product1()
	{
	  System.out.println("some product");
	}	
}
class Ekart
{
	public static void main(String[] args)
	{
		Amazon a1=new Amazon();
		Customer1.needprod(a1);
		Amazon a2 =new Amazon();
		Customer2.needprod(a2);
	}
}
class Customer1
{
	static void needprod(Amazon a2)
	{
		a2.product1();
	}
}
class Customer2{
	static void needprod(Amazon a3)
	{
		a3.product1();
	}
}