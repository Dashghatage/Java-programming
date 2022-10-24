package Abstraction_programe;
interface ShoppingMall
{
	public void shopping();
}
class Clothes implements ShoppingMall
{
	public void shopping()
	{
		System.out.println("buy Clothes");
	}
}
class Food implements ShoppingMall
{
	public void shopping()
	{
		System.out.println("eat food");
	}
}
class Movie implements ShoppingMall
{
	public void shopping()
	{
		System.out.println("watch movies");
	}
}
class Custmer
{
	static void purchase(ShoppingMall s1)
	{
		s1.shopping();
	}
}
public class Mainclass4 {
	public static void main(String[] args) {
		Clothes c1=new Clothes();
		Food f1=new Food();
		Movie m=new Movie();
		Custmer.purchase(c1);
		Custmer.purchase(f1);
		Custmer.purchase(m);
	}

}
