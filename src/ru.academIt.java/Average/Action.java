package Average;

public class Action {
	public static boolean IfInt(String s) { // Сюда нужно подставить a или b, как правильно?
		try {
			int testInt = Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			System.out.println("Not int!");
		}
		return false;
	}

	public static int IntValue(String s) {
		return Integer.parseInt(s);
	}

	public static double Average(int aInt, int bInt) {

		System.out.print("\nThe array means are: ");
		for (int i = aInt; i <= bInt; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		int count = 0;
		double sum = 0.0;
		while (aInt <= bInt) {
			sum = sum + aInt;
			count++;
			aInt++;
		}
		System.out.println("Sum = " + sum);
		System.out.println("Total Numbers = " + count);
		return (sum / count);
	}

	public static double AverageEven(int aInt, int bInt) {
		System.out.print("\nThe array EVEN means are: ");
		for (int i = aInt; i <= bInt; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		int count = 0;
		double sum = 0.0;
		while (aInt <= bInt) {
			if (aInt % 2 == 0) {
				sum = sum + aInt;
				count++;
			}
			aInt++;
		}
		System.out.println("Sum (EVEN) = " + sum);
		System.out.println("Total Numbers (EVEN): = " + count);
		return (sum / count);
	}
}