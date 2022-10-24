package VectorTopic;

import java.util.Vector;

public class Sample9 {
public static void main(String[] args) {
	Vector l1=new Vector();
	l1.add("Banglore");
	l1.add("Mandya");
	l1.add("Chennai");
	l1.add("Goa");
	l1.add("Bombay");
	System.out.println("b4--->"+l1);
	if (l1.contains("Mandya")) {
		if(l1.remove("Goa"))
		{
			System.out.println("goa is removed");
		}else{
			System.out.println("goa is not removed....");
		}
	
	}
	System.out.println("a4---->"+l1);
}
}
