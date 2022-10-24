package QueueTopic;

import java.util.PriorityQueue;

public class Sample9 {
	void add(Object obj)
	{
		
	}
public static void main(String[] args) {
	PriorityQueue l1=new PriorityQueue();
	l1.add(10);
	l1.add(6);
	l1.add(10);
	l1.add(45);
	
	PriorityQueue l2=new PriorityQueue();
	l2.add(10);
	l2.add(20);
	l2.add(30);
	l2.add(40);
	
	System.out.println(l2);
	l1.addAll(l2);
	System.out.println(l1);
	System.out.println(l1.peek());
	System.out.println(l1);
	
	System.out.println(l1.peek());
	System.out.println(l1);
	
	System.out.println(l1.peek());
	System.out.println("*****polling******");
	System.out.println(l1);
	
	System.out.println(l1.poll());
	System.out.println(l1);
	
	System.out.println(l1.poll());
	System.out.println(l1);
	
	System.out.println(l1.poll());
	System.out.println(l1);
}
}