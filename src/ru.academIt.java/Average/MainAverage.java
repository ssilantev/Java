package Average;

import java.util.Scanner;

public class MainAverage {
	public static void main(String[] args) {
		System.out.println("Find average for all and specialy all even int numbers from a to b.");
		Scanner scanner = new Scanner(System.in);
		String a = "";
		while (a.length() == 0){
//		while ((Action.CheckInt(a) = false) || (Action.IntForm(a) < 2)) {
			System.out.print("Type a: ");
			a = scanner.nextLine();
		}
		String b = "";
		while ((b.length() == 0) || (Action.IntValue(a) <= Action.IntValue(b))) {
			System.out.println("Type b: ");
			b = scanner.nextLine();
			if (b.length() > 0) {
				System.out.println("b is correct.");
			}
		}
//			Here is average for all int numbers from a to b.;

//			Here is average for only even int numbers from a to b.;
	}
}

// while ((Action.CheckInt(a) = false) || (Action.IntForm(a) < 2)) {
// 		while ((Action.CheckInt(b) = false) || (Action.IntForm(a) <= Action.IntForm(b))) {