package hashCodeMethod;

public class Sample5 extends Object {
@Override
public int hashCode()
{
	return 123;
}
public static void main(String[] args) {
	Sample5 s5=new Sample5();
	System.out.println(s5.hashCode());
}
}
