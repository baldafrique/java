package chap07;

import java.util.Scanner;

public class SumOf1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Number of elements: ");
		int size = scanner.nextInt();
		int[] numbers = new int[size];
		int sum = 0;
		
		for (int i = 0; i < size; i++) {
			System.out.print("x[" + i + "]: ");
			numbers[i] = scanner.nextInt();
			sum += numbers[i];
		}
		
		System.out.println(sum);
		scanner.close();
	}

}
