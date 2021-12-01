package chap07;

import java.util.Scanner;

public class InverseNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input;
		
		do {
			input = scanner.next();
		} while (Integer.parseInt(input) <= 0);
		
		for (int i = input.length() - 1; i >= 0; i--) {
			System.out.print(input.charAt(i));
		}
		
		scanner.close();
	}

}
