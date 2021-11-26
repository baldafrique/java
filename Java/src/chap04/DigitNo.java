package chap04;

import java.util.Scanner;

public class DigitNo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int digit = 0;
		
		while (x > 0) {
			x /= 10;
			digit ++;
		}
		
		System.out.println(digit);
		scanner.close();
	}

}
