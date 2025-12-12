package day2;

public class If {

	
	// Hello!! Rob
	// Hola!! Rob
	
	// Java is a strongly typed language.
	public static void main(String[] args) {
		
		If hw = new If();
		
		// variables -> a place to store some information
		// you reserve a place in the memory to store a value
		// this space is data specific
		// String, numbers, floating point, class/object, arrays
		
		String speaks = "Spanish";
		String name = "Rob";	
		
		// conditional statements
		if (speaks.equals("Spanish")) {
			hw.GreetInSpanish(name);
		} else if (speaks.equals("German")) { 
			hw.GreetInGerman(name);
		} else {
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
