package Numbers;

public class Methods {
	public static boolean ifLong(String s) {
//	public static boolean ifInt(String s) {
		try {
			long testLong = Long.parseLong(s, 10);
//			int testInt = Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			System.out.println("Not int!");
		}
		return false;
	}

	public static long intValue(String s) {
		return Long.parseLong(s, 10);
	}

	public static long sumNumbers(String s) {
		long num = intValue(s);
		long sum = 0;
		while (num > 0) {
			sum += (num % 10);
			num /= 10;
		}
		return sum;
	}

	public static long sumEvenNumbers(String s) {
		long numEven = intValue(s);
		long sumEven = 0;
		while (numEven > 0) {
			if (numEven % 2 == 0) {
				sumEven += (numEven % 10);
			}
			numEven /= 10;
		}
		return sumEven;
	}

	public static long greatestNumber(String s) {
		long n = intValue(s);
		int a, m = 0;
		while (n > 0) {
			a = (int) n % 10;
			if (a > m) {
				m = a;
			}
			n /= 10;
		}
		return m;
	}
}