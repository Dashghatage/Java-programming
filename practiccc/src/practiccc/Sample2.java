package practiccc;
//swapping no. without using third variable//
public class Sample2 {
public static void main(String[] args) {
	int a=10;
	int b=30;
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(a);
	System.out.println(b);
}
}
