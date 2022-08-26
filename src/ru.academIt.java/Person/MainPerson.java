package Person;

import java.util.Scanner;
import java.time.YearMonth;

public class MainPerson {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Type your name: ");
		String name = scanner.nextLine();

		System.out.print("Type your middle name: ");
		String middleName = scanner.nextLine();

		System.out.print("Type your family name: ");
		String familyName = scanner.nextLine();

		System.out.print("Please, type your age: ");
		int age = Integer.parseInt(scanner.nextLine());

		int yearOfBirth = YearMonth.now().getYear() - age;

		Person person = new Person(name, middleName, familyName, age, yearOfBirth);

		System.out.println("A new object of 'Person' class is created: " + person);
	}
}