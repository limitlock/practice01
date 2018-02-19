package practice01;

public class Prob05 {

	public static void main(String[] args) {

		int[] arr = { 3, 6, 9 };

		for (int i = 1; i < 100; i++) {

			if ((i / 10 == 3 || i / 10 == 6 || i / 10 == 9) && (i % 10 == 3 || i % 10 == 6 || i % 10 == 9)) {
				System.out.println(i + " 짝짝");
			} else if ((i / 10 == 3 || i / 10 == 6 || i / 10 == 9) || (i % 10 == 3 || i % 10 == 6 || i % 10 == 9)) {
				System.out.println(i + " 짝");
			}

		}

	}

}
