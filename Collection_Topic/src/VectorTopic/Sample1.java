package VectorTopic;

import java.util.Vector;
public class Sample1 {
	void add(Object obj)
	{
		
	}
public static void main(String[] args) {
	Vector l1 =new Vector();
	l1.add(10);
	l1.add(20.56);
	l1.add(10);
	l1.add('A');
	l1.add("Hello");
	System.out.println(l1.size());
	l1.add("Capacity--->"+l1.capacity());
    for (int i = 0; i < l1.size(); i++) {
		System.out.println(l1.get(i));
	}
}
}