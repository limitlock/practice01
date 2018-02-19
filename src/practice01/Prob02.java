package practice01;

public class Prob02 {

	public static void main(String[] args) {
		int k;
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				k = i + j - 1;
				System.out.print(" " + k);
				if (k > 10) {
					k -= 10;
				}
			}
			System.out.println();

		}

	}

}
