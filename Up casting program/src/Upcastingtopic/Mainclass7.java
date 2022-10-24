package Upcastingtopic;
class Cola1
{
	int f=80;
}
class Chungacha extends Cola1
{
	int d=20;
}
public class Mainclass7 {
public static void main(String[] args) {
	Cola1 c1=new Chungacha();
	System.out.println(c1.f);
	Chungacha c3=(Chungacha)c1;
	System.out.println(c3.d);
	System.out.println(c3.f);
}
}
