package Upcastingtopic;
class Tester3
{
	int r=5;
	void disp()
	{
		System.out.println("Disp......");
	}
}
class Tista1 extends Tester3
{
	void utlliya()
	{
		System.out.println("hey Utlliya....");
	}
}
public class Mainclass10 {
public static void main(String[] args) {
	Tester3 t3=new Tista1();
	System.out.println(t3.r);
	t3.disp();
	Tista1 t1=(Tista1)t3;
	t1.utlliya();
	t1.disp();
	System.out.println(t1.r);
}
}
