package For;

public class MainFor {
	public static void main(String[] args) {
		int[] Array = new int[101];
		for (int i = 100; i >= 1; i--) {
			Array[i] = i;
		}
		For.dividedIntoFour(Array);
	}

}
