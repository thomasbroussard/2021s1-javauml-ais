package fr.epita.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import fr.epita.persons.datamodel.Person;
import fr.epita.persons.services.PersonCSVReader;

public class TestPersonCsvReader {

	public static void main(String[] args) throws IOException {
		List<Person> persons = PersonCSVReader.readAll("./personCSVReader/persons.csv");
		System.out.println(persons);
	}




}
