package day4;

public class ObjectOriented {

	public static void main(String[] args) {

		String name = "Hello this is a sample line of text!!";

		char []arr = name.toCharArray();
		int i = 0;
		for (; i < arr.length; i++) { // length is a attribute/property
			System.out.println(arr[i]);			
		}
		
		System.out.println("Size of string is: " + i);
		System.out.println("Size of string is: " + name.length()); // length is a behaviour

		// example - 2

//		ObjectOriented objectOriented = new ObjectOriented();
//		objectOriented.subString(name, i, i);
		
		String newSubString = subString(name, 5, 10); // procedural programming
		
		name.substring(5, 10); // object oriented		
		
		
//		rotate(shape); // procedural
		// shape.rotate()
		// triangle.rotate()
		// square.rotate()
		// CRUD -> create, read, update, delete
	}

	public static String subString(String str, int startIndex, int endIndex) {
		
		return null;
	}
}
