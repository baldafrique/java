package chap07;

import java.util.Scanner;

public class SumUp1 {
	
	public static int sum(int number) {
		int sum = 0;
		
		while(number > 0) {
			sum += number--;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = scanner.nextInt();
		System.out.println("Sum: " + sum(number));
		scanner.close();
	}

}
