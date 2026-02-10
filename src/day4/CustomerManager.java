package day4;

public class CustomerManager {

	public static void main(String[] args) {

		Customer customer1 = new Customer("123", "some-customer-name"); // instantiates a new object
		
//		customer1.id = "xyz";
//		customer1.address = "asjdhajksd";
		
		print(customer1);
//		customer1.setCustomer("123", "some-customer-name", "some address"); // setter
		
//		System.out.println("Id: " + customer1.getId()); // getter
//		System.out.println("Name: " + customer1.getName());
//		System.out.println("Address: " + customer1.getAddress());
		

		// Now we want to force that a customer should not be created without any data.
		// we will use constructor, we will decide how we want to construct the instance
		// meaning, we can decide that we only need id and name to create a customer
		Customer customer2 = new Customer("124", "customer2", "address-2"); // instantiates a new object
		print(customer2);
//		System.out.println("Id: " + customer2.getId()); // getter
//		System.out.println("Name: " + customer2.getName());
//		System.out.println("Address: " + customer2.getAddress());

		// customer moves to a new location and address is updated
		customer2.setAddress("new address for customer 2");
		print(customer2);
//		System.out.println("Address: " + customer2.getAddress());

	}

	public static void print(Customer c) {
		System.out.println("Id: " + c.getId()); // getter
		System.out.println("Name: " + c.getName());
		System.out.println("Address: " + c.getAddress());
		
	}
}
