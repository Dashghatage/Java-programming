package practiccc;

public class ArrayProg {
public static void main(String[] args) {
	//array fetch
	
//	int[]arr={10,20,30,40,50};
//	for (int i = 1; i < arr.length; i++) {
//		System.out.println(arr[i]);
//	}
	
	//array Sum even
//	int[]arr={1,2,3,4,5,6,7,8};
//	int sum=0;
//	for (int i = 1; i < arr.length; i++) {
//		if (arr[i]%2==0) {
//			sum=sum+arr[i];
//		}
//	}
//	System.out.println(sum);
	
	
	//sum odd
	
//	int[]arr={1,2,34,5,6,7,8,9,4,6,4,1,8,9};
//	int sum=0;
//	for (int i = 1; i < arr.length; i++) {
//		if (arr[i]%2==1) {
//			sum+=arr[i];
//		}
//	}
//	System.out.println(sum);
	
	
	//count even
	
//	int[]arr={2,5,3,6,4,7};
//	int count=0;
//	for (int i = 1; i < arr.length; i++) {
//		if (arr[i]%2==0) {
//			count=arr[i];
//			count++;
//		}
//	}
//	System.out.println(count);
	
	
	//count odd
	
	int[]arr={25,8,9,7};
	int count=0;
	for (int i = 1; i < arr.length; i++) {
		if (arr[i]%2==1) {
			count=arr[i];
		}
	}
	System.out.println(count);
	
	
}
}
