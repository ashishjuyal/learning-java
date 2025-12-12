package day2;

public class DoWhile {
	
	// loop / iteration
	// do-while is a post increment check
	public static void main(String[] args) {
		printNumbers();
		reverse();
	}

	public static void printNumbers() {
		// print numbers from 1 to 5
		int i = 1;
		
		do {
			System.out.println(i);
			i++;
		}while(i < 6);
	}
	
	// print the numbers from 5 to 1
	public static void reverse() {
		int i = 5;
		do {
			System.out.println(i);
			i--;
		}while(i > 0);
	}
}
