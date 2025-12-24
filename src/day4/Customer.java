package day4;

public class Customer {

	// all the variables are properties/attributes/knows
	// these are also called instance variables
	// private and public are access modifiers
	private String id; // unique
	private String name;
	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// this is the constructor
	Customer(String id, String name) {
		this.id = id;
		this.name = name;
	}

	Customer(String id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	// all public functions are responsibilities/behavior/does
	public String getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}



	public String getLast10Transactions() {
		return null;
	}

//	public void setCustomer(String customerId, String name, String address) {
//		id = customerId; // works without this because there is no other id
//		this.name = name; // will not work without this because name is common as a parameter and instance variable
//		this.address = address;
//	}

}
