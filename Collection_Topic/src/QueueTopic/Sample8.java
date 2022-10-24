package QueueTopic;


import java.util.PriorityQueue;


public class Sample8 {
	void add(Object obj)
	{
		
	}
public static void main(String[] args) {
	PriorityQueue l1=new PriorityQueue();
	l1.add(10);
	l1.add(6);
	l1.add(10);
	l1.add(45);
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
