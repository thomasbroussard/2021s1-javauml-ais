package fr.epita.bank.datamodel;


public class Customer {
	private String name;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null){
			return;
		}
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}