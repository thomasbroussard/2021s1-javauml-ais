package fr.epita.bank.launchers;


import fr.epita.bank.datamodel.Customer;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello in my bank application");
		Customer customer = new Customer();

		customer.setAddress("Paris");
		customer.setName("Thomas");

		System.out.println("Hi " + customer.getName() + ", how are you doing?");
	}
}
