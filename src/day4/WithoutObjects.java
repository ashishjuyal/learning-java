package day4;

public class WithoutObjects {

	public static void main(String[] args) {
		// We want to store customer ids and names without creating objects
		
		int[] customerIds = {2,1,3};
		String[] customerNames = {"first", "second", "third"};
		
		for (int i = 0; i < customerIds.length; i++ ) {
			System.out.println("Customer Id: " + customerIds[i]);
			System.out.println("Customer Name: " + customerNames[i]);
			System.out.println("======");
		}
		

		
	}

}
