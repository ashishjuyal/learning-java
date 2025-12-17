package day3;

public class Arrays {

	public static void main(String[] args) {

		// store marks of a student for 5 subjects
		// array is a continuous memory location
		// once an array is created, its size cannot be increased or decreased
		
		int[] marks = {10,20}; // initialization
		
		System.out.println("Length: " + marks.length);
		
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		
//		System.out.println(marks[2]); // what will happen here?
		
		String[] cities = new String[5];
		System.out.println("Length: " + cities.length);
		cities[0] = "new delhi";
		cities[1] = "gurgaon";
		cities[2] = "noida";
		cities[3] = "vellore";
		cities[4] = "gzb";
		
		for(int i = 0; i < cities.length; i++ ) {
			System.out.println(cities[i]);
		}
	}

}
