package practice01;

import java.util.Scanner;

public class Prob04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Bat Man
		System.out.print("문자열을 입력하세요 : ");
		String text = scanner.nextLine();

		// System.out.println(text.length());

		for (int i = 0; i < 1; i++) {
			for (int j = i; j < text.length(); j++) {

				System.out.println(text.substring(i, j + 1));
			}

		}

	}
}