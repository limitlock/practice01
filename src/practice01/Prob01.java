package practice01;

import java.util.Scanner;

public class Prob01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner( System.in );
		
		int number = scanner.nextInt();
		
		if(number%3 == 0) {
			System.out.println(number);
			System.out.println("배수");
		}
		else {
			System.out.println(number);
			System.out.println("노배수");
		}
	}
}
