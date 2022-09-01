package For;

public class MainFor {
	public static void main(String[] args) {
		int[] Array = new int[101];
		for (int i = 100; i >= 1; i--) {
			Array[i] = i;
			System.out.print(Array[i] + " ");
		}
	}




//	for (int i = 100; i > 1; i--) {
//		System.out.print(i + " ");


//	int[] thirteenMultiples = new int[400];
//    for (int dex = 0; dex < thirteenMultiples.length; dex ++) {
//		int multiples = 13 * dex;
//		thirteenMultiples[dex] = multiples;
//		System.out.println(Arrays.toString(thirteenMultiples));
//	}
}
