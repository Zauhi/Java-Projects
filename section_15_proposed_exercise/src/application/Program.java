package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		String sourceFileStr = "C:\\temp\\proposed_exercise.csv";
		
		File sourceFile = new File(sourceFileStr);
		String sourceFolderStr = sourceFile.getParent();
		
		@SuppressWarnings("unused")
		boolean success = new File(sourceFolderStr + "\\out").mkdir();
		
		String targetFileStr = sourceFolderStr + "\\out\\sumary.csv";
		
		// Reading
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
			String line = br.readLine();
			
			while (line!=null) {
				String[] productInfo = line.split(",");
				
				String name = productInfo[0];
				double price = Double.parseDouble(productInfo[1]);
				int quantity = Integer.parseInt(productInfo[2]);
				
				list.add(new Product(name, price, quantity));
				line = br.readLine();
			}
			// Writing
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
				for (Product p : list) {
					bw.write(p.toString());
					bw.newLine();
				}
				
				System.out.println(targetFileStr + " created");
			}
			catch (IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}
		}
		catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
		
		
		
		sc.close();
	}

}
