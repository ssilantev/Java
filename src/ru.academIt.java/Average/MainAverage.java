package Average;

import java.util.Scanner;

public class MainAverage {
	public static void main(String[] args) {
		System.out.println("Find average for all and specially all even int numbers from a to b.");
		Scanner scanner = new Scanner(System.in);
		String a = "";
		while ((a.length() == 0) || !(Action.ifInt(a)) || (Action.intValue(a) < 2)) {
			System.out.print("Type \"a\" greater than \"1\": ");
			a = scanner.nextLine();
		}
		String b = "";
		while ((b.length() == 0) || !(Action.ifInt(a)) || (Action.intValue(b) <= Action.intValue(a))) {
			System.out.print("Type \"b\" greater than \"a\": ");
			b = scanner.nextLine();
		}

//		int aInt = Action.intValue(a);
//		int bInt = Action.intValue(b);

		System.out.println("Values received: a = " + a + ", b = " + b + ".");


		System.out.print("\nThe array means are: ");
		for (int i = Action.intValue(a); i <= Action.intValue(b); i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println("The average mean of all array members from a to b is: " + Action.average(Action.intValue(a), Action.intValue(b)) + ".");


		System.out.print("\nThe array EVEN means are: ");
		for (int i = Action.intValue(a); i <= Action.intValue(b); i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		System.out.println("The average mean of EVEN array members from a to b is: " + Action.averageEven(Action.intValue(a), Action.intValue(b)) + ".");
	}
}