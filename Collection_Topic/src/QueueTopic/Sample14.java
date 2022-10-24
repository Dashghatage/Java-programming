package QueueTopic;

import java.util.PriorityQueue;

public class Sample14 {
public static void main(String[] args) {
	PriorityQueue l1=new PriorityQueue();
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
