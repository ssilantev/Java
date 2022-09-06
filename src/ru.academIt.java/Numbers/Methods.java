package Numbers;

public class Methods {
	public static boolean ifInt(String s) {
		try {
			int testInt = Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
//			System.out.println("Not int!");
		}
		return false;
	}

	public static int intValue(String s) {
		return Integer.parseInt(s);
	}
	public static int sumNumbers(String s){
		int num = intValue(s);
		int sum = 0;
		while(num != 0){
			sum += (num % 10);
			num /= 10;
		}
		return sum;
	}
}
