package For;

public class MainFor {
	private static boolean divToFour(int i) {
		return i % 4 == 0;
	}

	public static void main(String[] args) {

		for (int i = 100; i >= 1; i--) {
			if (divToFour(i)) {
				System.out.print(i + " ");
			}
		}
	}
}