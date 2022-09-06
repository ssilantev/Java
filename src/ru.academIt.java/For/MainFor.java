package For;

public class MainFor {
	public static void main(String[] args) {
		int[] Array = new int[101];
		for (int i = 100; i >= 1; i--) {
			Array[i] = i;
		}
		for (int j = Array.length - 1; j >= 1; j--) {
			if (Array[j] % 4 == 0) {
				System.out.print(Array[j] + " ");
			}
		}
	}
}