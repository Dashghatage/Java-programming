package VectorTopic;

import java.util.Vector;

public class Sample6 {
	void removeAll()
	{
		
	}
public static void main(String[] args) {
	Vector l1=new Vector();
	l1.add(10);
	l1.add(20);
	l1.add(30);
	l1.add(40);
	Vector l2=new Vector();
	l2.add(30);
	l2.add(40);
	l2.add(50);
	l2.add(60);
	l2.add(70);
	System.out.println("b4--->");
	System.out.println(l1);
	System.out.println(l2);
	l1.removeAll(l2);
	System.out.println("a4--->");
	System.out.println(l1);
	System.out.println(l2);
}
}
