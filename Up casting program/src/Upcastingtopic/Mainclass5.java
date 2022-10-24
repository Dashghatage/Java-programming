package Upcastingtopic;
class Demo1
{
	double z=15.25;
}
class Dumtaka extends Demo1
{
	int x=52;
}
public class Mainclass5 {
	public static void main(String[] args) {
		Demo1 d1=new Dumtaka();
		System.out.println(d1.z);
		Dumtaka d2=(Dumtaka)d1;
		System.out.println(d2.x);
		System.out.println(d2.z);
	}

}
