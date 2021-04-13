package fr.epita.bank.launchers;


import fr.epita.bank.datamodel.Customer;
import fr.epita.bank.datamodel.SavingsAccount;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello in my bank application");
		Customer customer = new Customer();

		customer.setAddress("Paris");
		customer.setName("Thomas");
		//code a scenario where the customer will create a savings account
		//the savings account will be initialized with a initial balance
		//the customer will then withdraw some money from this account (choose the amounts)

		SavingsAccount savingsAccount = new SavingsAccount();
		int initialBalance = 200;
		savingsAccount.setBalance(initialBalance);

		savingsAccount.setBalance(savingsAccount.getBalance() - 10);

		System.out.println("Hi " + customer.getName() + ", how are you doing?");
	}
}
