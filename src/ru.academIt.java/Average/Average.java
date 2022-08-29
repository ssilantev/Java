package Average;

public class Average {

	public static boolean isNumeric(String a) {
		int intValue;

		System.out.println(String.format("Parsing string: \"%s\"", a));

		if(a == null || a.equals("")) {
			System.out.println("String cannot be parsed, it is null or empty.");
			return false;
		}

		try {
			intValue = Integer.parseInt(a);
			return true;
		} catch (NumberFormatException e) {
			System.out.println("Input String cannot be parsed to Integer.");
		}
		return false;
	}
}