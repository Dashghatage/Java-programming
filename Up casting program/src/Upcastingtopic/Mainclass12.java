package Upcastingtopic;
class Demo10
{
   double x=20.20;
   int r=25;
}
class Dumtaka3 extends Demo10
{
	int x=100;
}
public class Mainclass12 {
	public static void main(String[] args) {
		Demo10 d1=new Dumtaka3();
		System.out.println(d1.r);
		System.out.println(d1.x);
		Dumtaka3 d3=(Dumtaka3)d1;
		System.out.println(d3.x);
		System.out.println(d3.r);
		System.out.println(d3.x);
	}

}
