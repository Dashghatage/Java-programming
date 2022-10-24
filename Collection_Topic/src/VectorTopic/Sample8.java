package VectorTopic;

import java.util.Vector;

public class Sample8 {	
public static void main(String[] args) {
	Vector l1=new Vector();
	l1.add("Banglore");
	l1.add(null);
	l1.add(true);
	l1.add(5);
	l1.add('A');
	System.out.println(l1.size());
	
	for(int i=0;i<l1.size();i++)
	{
		Object obj=l1.get(i);
	}	System.out.println(l1);			
}
}
