package hashCodeMethod;

public class Sample4 {
public static void main(String[] args) {
	Sample4 s4=new Sample4();
	Sample4 s5=s4;
	System.out.println(s4.hashCode());
	System.out.println(s5.hashCode());
}
}
