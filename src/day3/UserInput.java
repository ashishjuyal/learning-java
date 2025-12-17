package day3;

import java.util.Scanner;

public class UserInput {
	// GUI -> Graphical user interface, Swing
	// HTML, CSS, JS
	
	// CLI -> command line interface
	
	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name =  scanner.nextLine();
		
		System.out.println("Enter your age: ");
		int age =  scanner.nextInt();		

		System.out.println("Name is: " + name);
		
		// BODMAS
		System.out.println("Adding 10 to age: " + age + 10); // (implicit) type conversion, all will be converted to string
		
//		System.out.println(age + 10); // No Type conversion because age and 10 both are numbers
		
		
	}
}
