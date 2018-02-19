package practice01;

import java.util.Scanner;

public class Prob03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();
		int ret = 0;

		if (number % 2 == 0) { // 짝수
			for (int i = 0; i <= number; i++) {
				if (i % 2 == 0) {
					ret += i;
				}
			}
			System.out.println(ret);
			System.out.println("짝수");

		} else {
			for (int i = 0; i <= number; i++) {
				if (i % 2 != 0) {
					ret += i;
				}
			}
			System.out.println(ret);
			System.out.println("홀수");
		}

	}

}
