package chap04;

import java.util.Scanner;

public class ThreeDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int value;
		
		do {
			value = scanner.nextInt();
		} while (value < 100 || value > 999);
		
		System.out.println(value);
		scanner.close();
	}

}
