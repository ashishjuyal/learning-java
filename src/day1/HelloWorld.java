package day1;

// highlighted words are called keywords or reserved words in Java

public class HelloWorld {

	/**
	 *  1. main function is the entry point of all the java application
	 *  2. Running a java program is a two step process
	 *  	compile and execute
	 *  but when we use any IDE -> Integrated Development environment
	 *  such as Eclipse, Intellij Idea, Visual Studio code
	 *  you just need to run, compilation happens in the background.
	 *  
	 *  1. javac <<filename.java>>
	 *  2. java <<filename.class>>
	 *  
	 *  for e.g.
	 *  1. javac HelloWorld.java -> generates the byte code
	 *  2. java HelloWorld.class -> executes the byte code
	 *    
	 */
	
	public static void main(String[] args) {
		System.out.println("Hello World!!");
		
		// we are creating an object of class HelloWorld
		// we are creating an object from the HelloWorld blueprint 
		HelloWorld hw = new HelloWorld();
		
		hw.GreetInSpanish();
		
//		GreetInSpanish();
	}
	
	// public ->  anyone can access
	// void -> does not return anything 
	public void GreetInSpanish() {
		System.out.println("Hola!!");
	}
}
