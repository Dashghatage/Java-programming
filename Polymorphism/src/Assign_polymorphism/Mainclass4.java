package Assign_polymorphism;
class Youtube
{
	void watch()
	{
		System.out.println("watch some videos");
	}
}
class Studies extends Youtube
{
	void watch()
	{
		System.out.println("Watch Educational videos");
	}
}
class Movies extends Youtube
{
	void watch()
	{
		System.out.println("Watch drama movies");
	}
}
class Technology extends Youtube
{
	void watch()
	{
		System.out.println("Watch Technology video");
	}
}
class User
{
	static void access(Youtube y1)
	{
		y1.watch();
	}
}
public class Mainclass4 {
	public static void main(String[] args) {
		Studies s1=new Studies();
		@SuppressWarnings("unused")
		Movie m1=new Movie();
		Technology t1=new Technology();
		User.access(s1);
        User.access(t1);
		User.access(t1);
	}

}
