package VectorTopic;

import java.util.Vector;

public class Sample2 {
	void add(Object obj)
	{
		
	}
public static void main(String[] args) {
	Vector l1=new Vector(5);
	l1.add(10);
	l1.add(20.56);
	l1.add(10);
	l1.add('A');
	System.out.println(l1.size());
	System.out.println(l1.capacity());
	System.out.println("****after adding more than 5 element***");
	l1.add('A');
	l1.add('B');
	l1.add(null);
	System.out.println(l1.size());
	System.out.println(l1.capacity());
	System.out.println(l1.toString());
	l1.add(2,'A');
	System.out.println(l1);
}
}