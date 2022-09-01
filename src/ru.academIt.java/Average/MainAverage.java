package Average;

import java.util.Scanner;

public class MainAverage {
	public static void main(String[] args) {
		System.out.println("Find average for all and specially all even int numbers from a to b.");
		Scanner scanner = new Scanner(System.in);
		String a = "";
		while ((a.length() == 0) || !(Action.IfInt(a)) || (Action.IntValue(a) < 2)) {
			System.out.print("Type \"a\" greater than \"1\": ");
			a = scanner.nextLine();
		}
		String b = "";
		while ((b.length() == 0) || !(Action.IfInt(a)) || (Action.IntValue(b) <= Action.IntValue(a))) {
			System.out.print("Type \"b\" greater than \"a\": ");
			b = scanner.nextLine();
		}

		int aInt = Action.IntValue(a);
		int bInt = Action.IntValue(b);

		System.out.println("Values received: a = " + a + ", b = " + b + ".");

		System.out.println("The average mean of all array members from a to b is: " + Action.Average(aInt, bInt) + ".");

		System.out.println("The average mean of EVEN array members from a to b is: " + Action.AverageEven(aInt, bInt) + ".");
	}
}