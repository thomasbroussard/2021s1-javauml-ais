package fr.epita.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import fr.epita.persons.datamodel.Person;
import fr.epita.persons.services.PersonCSVReader;

public class TestPersonCsvReader {

	public static void main(String[] args) throws IOException {
		List<Person> persons = PersonCSVReader.readAll("./personCSVReader/persons.csv");

		List<Person> males = persons.stream()
				.filter(p -> p.getSex().equals("M"))
				.collect(Collectors.toList());
		List<Person> females = persons.stream()
				.filter(p -> p.getSex().equals("F"))
				.collect(Collectors.toList());
		
		System.out.println("males : " + males.size());
		System.out.println("females : " + females.size());

	}




}
