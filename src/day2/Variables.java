package day2;

public class Variables {

	// Java has two data types
	// 1. primitive -> int, long, float, double
	// 2. Objects   -> Integer, String
	
	public static void main(String[] args) {	
		int i =  999999999; // creating variable
		
		long k = 999999999999999999L; 
		
		System.out.println(i);
		System.out.println(k);
		
		float a = 10.2f;
		float d = 10012312312.123324f;
		
		System.out.println(a);
		System.out.println(d);
		
		double r = Math.random();
		
		System.out.println("Random: " + r*100);
//		int x = i - 2;
//		System.out.println(x);
//		
//		i = i - 2; // assignment
//		System.out.println(i);
//		
//		i = 10.2;
		
	}
}
