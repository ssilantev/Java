package Average;

public class Action {
	public class Range {
		private String a;
		private String b;

		public Range(String a, String b) {
			this.a = a;
			this.b = b;
		}
	}

	public static boolean checkInt(String a, String b) { // Сюда нужно подставить a или b, как правильно?
		for () {
			try {
				int intValueA = Integer.parseInt();
				return true;
			} catch (NumberFormatException e) {
				System.out.println("Incorrect data type");
			}
			return false;
		}
	}

	public static int IntForm() { // Сюда нужно подставить a или b, как правильно?
		int intValue = Integer.parseInt();
		return intValue;
	}
}



//	public static boolean IntA(String a) {
//
//		if (a == null || a.equals("")) {
//			System.out.println("Empty data.");
//			return false;
//		}
//		try {
//			int intValueA = Integer.parseInt(a);
//			return true;
//		} catch (NumberFormatException e) {
//			System.out.println("Incorrect data type");
//		}
//		return false;
//	}
//	public static boolean IntB(String b) {
//		int intValueA;
//
//		if (b == null || b.equals("")) {
//			System.out.println("Empty data.");
//			return false;
//		}
//		try {
//			intValueA = Integer.parseInt(b);
//			return true;
//		} catch (NumberFormatException e) {
//			System.out.println("Incorrect data type");
//		}
//		return false;
//	}




//	public static boolean isInt(String a, String b) {
//		//		System.out.println(String.format("Parsing string: \"%s\"", ));
//
//		for (String var : String a, String) b)
//			 {
//
//		}
//
//		if ((a.length() == 0) || (b.length() == 0)){
//			System.out.println("Empty data!");
//			return false;
//		}
//		else{
//			try {
//				int intValue = Integer.parseInt(a);
//				System.out.println("Int type confirmed.");
//				return true;
//			} catch (NumberFormatException e) {
//				System.out.println("Input String cannot be parsed to Integer.");
//
//				return false;
//			}
//
//		if (b.length() == 0) {
//			System.out.println("Empty data!");
//			return false;
//		}
//		else{
//			try {
//				int intValue = Integer.parseInt(b);
//				System.out.println("Int type confirmed.");
//				return true;
//			} catch (NumberFormatException e) {
//				System.out.println("Input String cannot be parsed to Integer.");
//
//				return false;
//			}
//
//		}
//	}
//}