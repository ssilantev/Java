package For;

public class MainFor {
	public static void main(String[] args) {
		int[] Array = new int[51];
		for (int i = 50; i >= 1; i--) {
			Array[i] = i;
			System.out.print(i + " ");
		}
		System.out.println();
		For.dividedIntoFour(Array);
	}

}
