package practiccc;

public class Demo {
	public static void main(String[] args) {
		// char[] ch={'j','A','v','a','M','a','v','A'};
		// int count=0;
		// for (int i = 0; i < ch.length; i++) {
		// if ((ch[i]>=65 && ch[i]<=90)) {
		// count++;
		// }
		// System.out.println(ch[i]+" "+count);
		// }

		// UPPER CASE

		// char []ch={'J','a','V','m','A','V','a'};
		// for (int i = 0; i < ch.length; i++) {
		// if (ch[i]>=65 && ch[i]<=90) {
		// System.out.println(ch[i]);
		// }
		// }

		// //Small CAse
		//
		// char ch[]={'J','a','V','M','a','j','S'};
		// for (int i = 0; i < ch.length; i++) {
		// if (ch[i]>=97 && ch[i]<=122) {
		// System.out.println(ch[i]);
		// }
		// }

		/// fetch number
		//
		// int no[]={74,1,2,96,38,52,7,4};
		// for (int i = 0; i < no.length; i++) {
		// if (no[i]>=48 && no[i]<=57) {
		// System.out.println(no[i]);
		// }
		// }
		//
		//
		
		//remove extra letter from given string
		
		String s1="h04ga be2da hu5du19i na8nn9a bi0tt4u";
		System.out.println(s1.replaceAll("[A-z]", ""));
		
	}
}
