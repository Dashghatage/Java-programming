package Runtime_polypmorphism_programm;
class Animal
{
	void noise()
	{
		System.out.println("some noise");
	}
}
class Dog extends Animal
{
	void noise()
	{
		System.out.println("bow bow bowww");
	}
}
class Cat extends Animal
{
	void noise()
	{
		System.out.println("meow mewo");
	}
}
class Snake extends Animal
{
	void noise()
	{
		System.out.println("hisss fisss tisss");
	}
}
class Stimulator
{
	static void ansim(Animal a1)
	{
		a1.noise();
	}
}
public class Mainclass {
	public static void main(String[] args) {		
	
	Dog d1=new Dog();
	Cat c1=new Cat();
	Snake s1=new Snake();
	Stimulator.ansim(d1);
	Stimulator.ansim(c1);
	Stimulator.ansim(s1);
	}
}
