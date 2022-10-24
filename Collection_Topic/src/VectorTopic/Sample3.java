package VectorTopic;
import java.util.Collection;
import java.util.Vector;
public class Sample3 {
	void addAll(Collection c)
	{
		
	}
public static void main(String[] args) {
	Vector l1= new Vector();
	l1.add(30);
	l1.add(25.25);
	l1.add(40);
	Vector l2=new Vector();
	l2.add('A');
	l2.add('B');
	l2.add('C');
	System.out.println("***b4***");
	System.out.println(l1);
	l1.addAll(l2);
	System.out.println("****a4***");
	System.out.println(l1);
	System.out.println(l2);
}
}