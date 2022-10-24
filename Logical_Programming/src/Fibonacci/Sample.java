package Fibonacci;

public class Sample {
public static void main(String[] args) {
	int fb1=0;
	int fb2=1;
	int fb3;
	System.out.println(fb1+" "+fb2);
	for (int i = 1; i <=10; i++) {
		fb3=fb1+fb2;
		fb1=fb2;
		fb2=fb3;
		System.out.println(fb3+" ");
	}
	}
	}
	
