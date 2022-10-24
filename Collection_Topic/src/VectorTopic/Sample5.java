package VectorTopic;

import java.util.Vector;

public class Sample5 {
	void remove()
	{
		
	}
public static void main(String[] args) {
	Vector l1=new Vector();
	l1.add("Banglore");
	l1.add("null");
	l1.add(true);
	l1.add(5);
	l1.add('A');
	System.out.println("b4--->"+l1);
	l1.remove(0);
	System.out.println("a4--->"+l1);
}
}
