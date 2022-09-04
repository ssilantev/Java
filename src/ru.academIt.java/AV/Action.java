package AV;

public class Action {

	public static int intValue(String s) {
		return Integer.parseInt(s);
	}

	public static double average(int aInt, int bInt) {

		int count = 0;
		double sum = 0.0;
		while (aInt <= bInt) {
			sum = sum + aInt;
			count++;
			aInt++;
		}
		return (sum / count);
	}

	public static double averageEven(int aInt, int bInt) {

		int countE = 0;
		double sumE = 0.0;
		while (aInt <= bInt) {
			if (aInt % 2 == 0) {
				sumE = sumE + aInt;
				countE++;
			}
			aInt++;
		}
		return (sumE / countE);
	}
}