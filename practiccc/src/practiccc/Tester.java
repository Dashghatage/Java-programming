package practiccc;
public class Tester {	
public static void main(String[] args) {
	int[]arr={5,4,7,1,3,6};
	int max=arr[0];
	for (int i = 0; i < arr.length; i++) {
		if (max<arr[i]) {
			max=arr[i];
		}
	}
	System.out.println(max);
}
}
