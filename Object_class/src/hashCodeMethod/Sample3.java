package hashCodeMethod;

public class Sample3 {
public static void main(String[] args) {
	Sample3 s3=new Sample3();
	System.out.println(s3);
	System.out.println(s3.hashCode());
	Sample3 s4=new Sample3();
	System.out.println(s4);
	System.out.println(s4.hashCode());
}
}
