package fr.epita.bank.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class TestReadFromFile {

	public static void main(String[] args) throws IOException {
//		String path = "S:\\tmp\\file";
//		String sampleString = "Hey this \"is\" a test about quotes";
//
//		System.out.println(sampleString);
//		path = "S:/tmp/file";
//		System.out.println(path);

		//Read using FileInputStream + Scanner
		//loadingFromFileInputStream();
		List<String> strings = Files.readAllLines(new File("./test/customers.csv").toPath());
		System.out.println(strings);

	}

	private static void loadingFromFileInputStream() throws IOException {
		FileInputStream fileInputStream = new FileInputStream("./test/customers.csv");
		Scanner scanner = new Scanner(fileInputStream);
		while (scanner.hasNext()) {
			System.out.println(scanner.next());
		}

		fileInputStream.close();
	}
}
