package Numbers;

public class Methods {
	public static boolean ifInt(String s) {
		try {
			int testLong = Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			System.out.println("Not int!");
		}
		return false;
	}

	public static int intValue(String s) {
		return Integer.parseInt(s);
	}

	public static int sumNumbers(String s) {
		int num = intValue(s);
		int sum = 0;
		while (num > 0) {
			sum += (num % 10);
			num /= 10;
		}
		return sum;
	}

	public static int sumEvenNumbers(String s) {
		int numEven = intValue(s);
		int sumEven = 0;
		while (numEven > 0) {
			if (numEven % 2 == 0) {
				sumEven += (numEven % 10);
			}
			numEven /= 10;
		}
		return sumEven;
	}

	public static int greatestNumber(String s) {
		int num = intValue(s);
		int remainder, maxDigit = 0;
		while (num > 0) {
			remainder = num % 10;
			if (remainder > maxDigit) {
				maxDigit = remainder;
			}
			num /= 10;
		}
		return maxDigit;
	}
}