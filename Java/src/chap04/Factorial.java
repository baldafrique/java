package chap04;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int factorial = 1;
		
		while (n > 0) {
			factorial *= n--;
		}
		
		System.out.println(factorial);
		scanner.close();
	}

}
