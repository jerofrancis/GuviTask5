package task5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculateAge4 {

	public static void main(String[] args) {
		// Create a Scanner object to read input
		Scanner scanner = new Scanner(System.in);

		// allow the user to enter their birthdate
		System.out.print("Enter your birthdate (YYYY-MM-DD): ");
		String birthdateStr = scanner.nextLine();

		// Parse the user's birthdate string into a LocalDate object
		LocalDate birthdate = LocalDate.parse(birthdateStr);

		// Get the current date
		LocalDate currentDate = LocalDate.now();

		// Calculate the age using Period class
		Period age = Period.between(birthdate, currentDate);

		// Display the user's age
		System.out.println("Your age is: " + age.getYears() + " years " + age.getMonths() + " months " + age.getDays() + " days");

		// Close the scanner
		scanner.close();
	}
}
