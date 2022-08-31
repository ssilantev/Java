package Average;

import java.util.Scanner;

public class MainAverage {
	public static void main(String[] args) {
		System.out.print("Find average for all and specialy all even int numbers from a to b.\n");
		Scanner scanner = new Scanner(System.in);
		String a = "";
		while ((Action.checkInt(a) = false) || (Action.IntForm(a) < 2)) {
			System.out.print("Type a: ");
			a = scanner.nextLine();
			if (a.length() > 0) {
				System.out.print("a is correct.");
			}
		}
		String b = "";
		while ((Action.checkInt(b) = false) || (Action.IntForm(a) >= Action.IntForm(b))) {
			System.out.print("Type b: ");
			b = scanner.nextLine();
			if (b.length() > 0) {
				System.out.print("b is correct.");
			}
		}
//			Here is average for all int numbers from a to b.;

//			Here is average for only even int numbers from a to b.;
	}
}