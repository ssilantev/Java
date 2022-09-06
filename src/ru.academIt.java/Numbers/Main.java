package Numbers;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = "";
		while ((input.length() == 0) || !(Methods.ifInt(input)) || (Methods.intValue(input) < 1)) {
			System.out.print("Enter natural value: ");
			input = scanner.nextLine();

		}
		System.out.println("Input is: " + input);

		System.out.println("Sum of all numbers is: " + Methods.sumNumbers(input));

//		System.out.println("Sum of even numbers is: " + Methods.sumEvenNumbers(input));

//		System.out.println("Greatest number is: " + Methods.greatestNumber(input));
	}
}
