package Average;

import java.util.Scanner;

public class MainAverage {
	public static void main(String[] args) {
		System.out.print("Find average for all and specialy all even int numbers from a to b.\n");
		Scanner scanner = new Scanner(System.in);
		String a = "";
		while (a.CheckInt(false) || (IntFormA < 2)) {
			System.out.print("Type a: ");
			a = scanner.nextLine();
			if (a.length() > 0) {
				System.out.print("a is correct.");
			}
		}
		String b = "";
		while (b.CheckInt(false) || (a.IntForm >= b.IntForm)) {
			System.out.print("Type b: ");
			a = scanner.nextLine();
			if (a.length() > 0) {
				System.out.print("b is correct.");
			}
		}
//			Here is average for all int numbers from a to b.;

//			Here is average for only even int numbers from a to b.;
	}
}