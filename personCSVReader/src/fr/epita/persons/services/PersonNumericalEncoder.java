package fr.epita.persons.services;

import fr.epita.persons.datamodel.Person;

public class PersonNumericalEncoder {

	public static int[] encode(Person person) throws IllegalArgumentException {
		int[] result = new int[4];
		if ("M".equals(person.getSex())){
			result[0] = 0;
		}else if ("F".equals(person.getSex())){
			result[0] = 1;
		}else{
			throw new IllegalArgumentException("sex value for entry : "+ person + " is not correctly defined");
		}
		result[1] = person.getAge();
		result[2] = person.getHeight();
		result[3] = person.getWeight();
		return result;
	}
}
