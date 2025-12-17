package day3;

public class Ascii {

	public static void main(String[] args) {
		// A -> 65
		// a -> 97, b -> 98
		
		char ch = 'A';
		
		System.out.println(ch);
		
//		int asciiValueOfch = ch;
		System.out.println((int)ch); // type-casting

//		Ascii ascii = new Ascii();		
		printAtoZ();
		
	}
	
	public static void printAtoZ() {		
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
		}
	}

}
