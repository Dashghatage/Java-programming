package Abstraction_programe;
interface Youtube
{
	public void watch();
}
class Studies implements Youtube
{
	public void watch()
	{
		System.out.println("watch educational videos");
	}
}
class Movies implements Youtube
{
	public void watch()
	{
		System.out.println("watch Movies");
	}
}
class Technology implements Youtube
{
	public void watch()
	{
		System.out.println("watch Technology videos");
	}
}
class User
{
	static void access(Youtube y1)
	{
		y1.watch();
	}
}
public class Mainclass3 {
public static void main(String[] args) {
	Studies s1=new Studies();
	Movies m1=new Movies();
	Technology t1=new Technology();
	User.access(s1);
	User.access(m1);
	User.access(t1);
}

}
