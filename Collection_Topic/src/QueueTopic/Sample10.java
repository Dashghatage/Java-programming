package QueueTopic;

import java.util.PriorityQueue;

public class Sample10 {
	void remove()
	{
		
	}
public static void main(String[] args) {
	PriorityQueue l1=new PriorityQueue();
	l1.add(10);
	l1.add(25);
	l1.add(10);
	l1.add(5);
	l1.add(30);
	System.out.println("b4--->"+l1);
	l1.remove(10);
	System.out.println("a4--->"+l1);
}
}
