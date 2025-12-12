package day2;

public class SwitchCase {

	
	// Hello!! Rob
	// Hola!! Rob
	
	// Java is a strongly typed language.
	public static void main(String[] args) {
		
		SwitchCase hw = new SwitchCase();
		
		// variables -> a place to store some information
		// you reserve a place in the memory to store a value
		// this space is data specific
		// String, numbers, floating point, class/object, arrays
		
		String speaks = "gerMAN";
		String name = "Rob";	
		
		// conditional statements
		switch (speaks.toLowerCase()){
		case "spanish":
			hw.GreetInSpanish(name);
			break;
		case "german":
			hw.GreetInGerman(name);
			break;
		default:
			hw.GreetInEnglish(name);
		}
	}
	
	public void GreetInGerman(String name) {		
		System.out.println("Hallo!! " + name);
	}

	public void GreetInSpanish(String name) {		
		System.out.println("Hola!! " + name);
	}

	public void GreetInEnglish(String name) {		
		System.out.println("Hello!! " + name);
	}

}
