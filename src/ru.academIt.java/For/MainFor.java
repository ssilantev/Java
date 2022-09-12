package For;

public class MainFor {
	private static boolean function(int i) {
		return i % 4 == 0;
	}

	public static void main(String[] args) {

		for (int i = 100; i >= 1; i--) {
			if (function(i)) {
				System.out.print(i + " ");
			}
		}
	}
}