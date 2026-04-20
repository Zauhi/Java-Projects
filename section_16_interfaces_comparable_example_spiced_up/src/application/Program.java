package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		// To spice up I'll create the file, hard coding the values in vectors

		String[] names = { "Maria Brown", "Alex Green", "Bob Grey", "Anna White", "Alex Black", "Eduardo Rose",
				"Willian Red", "Marta Blue", "Alex Brown" };
		Double[] salaries = { 4300.00, 3100.00, 3100.00, 3500.00, 2450.00, 4390.00, 2900.00, 6100.00, 5000.00 };

		String path = "C:\\temp\\in.txt";
		List<Employee> list = new ArrayList<>();

		// Writing a new file
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (int i = 0; i < names.length; i++) {
				bw.write(names[i] + "," + salaries[i]);
				bw.newLine();
			}
			System.out.println("in.txt created");
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		// Reading the file created
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				String[] employeeInfo = line.split(",");

				list.add(new Employee(employeeInfo[0], Double.parseDouble(employeeInfo[1])));
				line = br.readLine();
			}

			Collections.sort(list);
			for (Employee emp : list) {
				System.out.println(emp.getName() + ", " + emp.getSalary());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
