package util;
public class Circle {
	void area(double r)
	{
		final double pi=3.142;
		double result=pi*r*r;
		System.out.println(result);
	}
	public static void main(String[]args){
	
		Circle s1 =new Circle();
		s1.area(1.5);
	}

}
