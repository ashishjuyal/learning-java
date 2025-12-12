package day2;

public class While {
	
	// loop / iteration
	// while, for, do-while
	// while is a pre check
	public static void main(String[] args) {
		reverse();
	}

	public void printNumbers() {
		// print numbers from 1 to 5
		int i = 1;
		while(i < 6) {
			System.out.println(i);
			i++;
		}
	}
	
	// print the numbers from 5 to 1
	public static void reverse() {
		int i = 5;
		while(i > 0) {
			System.out.println(i);
			i--;
		}
	}
}
