package ArryListTopic;import java.util.ArrayList;
import java.util.Collection;

public class Sample3 {
	void addAll(Collection c)
	{
		
	}
public static void main(String[] args) {
	ArrayList l1= new ArrayList();
	l1.add(30);
	l1.add(25.25);
	l1.add(40);
	ArrayList l2=new ArrayList();
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
