package day5;

import day4.Customer;

public class PassByValue {

	
	
	public static void main(String[] args) {
		// Java is always pass by value (this statement is correct) 
		// But a lot of times it is said: Java is pass by value in case of primitives, Java is pass by reference in case of objects.
		
		
//		TestByValue();
//		TestByReference();
		
		int[] nums = {1,2,3};
		TestArrayReference(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

	}

	public static void TestArrayReference(int[] nums) {
		// mutating array
		for (int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] * 2;
		}
	}
	
	public static void TestByReference() {	
		Customer cust = new Customer("id-1", "some name");
		
		ByReference(cust);
		
		System.out.println("After calling..." );
		System.out.println("Id: " + cust.getId());		
		System.out.println("Name: " + cust.getName());		
	}

	public static void ByReference(Customer c) {
		
		// mutating the customer object
		c.setId("some-new-id");
		c.setName("some new name");
		
		System.out.println("Inside ByReference ..." );
		System.out.println("Id: " + c.getId());		
		System.out.println("Name: " + c.getName());		
	}
	
	public static void TestByValue() {	
		int x = 7;
		
		ByValue(x);
		
		System.out.println("Value of x after: " + x);		
	}
	
	public static void ByValue(int x) {
		System.out.println("Value: " + x);
		x  = 10;
	}
}
