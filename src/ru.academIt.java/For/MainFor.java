package For;

public class MainFor {
	private static void function(int i) {
		if (i % 4 == 0) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {

		for (int i = 100; i >= 1; i--) {
			function(i);
		}
	}
}