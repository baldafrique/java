package chap07;

import java.util.Scanner;

public class InverseNumber2 {
	static Scanner scanner = new Scanner(System.in);
	
	public static int readPlusInt() {
		int number;
		
		do {
			number = scanner.nextInt(); 
		} while (number <= 0);
		
		return number;
	}

	public static void main(String[] args) {
		int input;
		
		do {
			int number = readPlusInt();
			
			while (number > 0) {
				System.out.print(number % 10);
				number /= 10;
			}
			
			do {
				System.out.println();
				System.out.print("Once more?<Yes...1/No...0>: ");
				input = scanner.nextInt();
			} while (input != 0 && input != 1);
		} while (input == 1);
	}

}
