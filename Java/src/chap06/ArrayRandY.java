package chap06;

import java.util.Random;
import java.util.Scanner;

public class ArrayRandY {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Number: ");
		int number = scanner.nextInt();
		int[] numbers = new int[number];
		boolean isDuplicated;
		
		for (int i = 0; i < number; i ++) {
			isDuplicated = false;
			do {
				numbers[i] = random.nextInt(10) + 1;
				for (int j = 0; j < i; j++) {
					if (numbers[i] == numbers[j]) {
						isDuplicated = true;
						break;
					}
					else {
						isDuplicated = false;
					}
				}
			}
			while (isDuplicated);
		}
		
		for (int j : numbers) {
			System.out.println(j);
		}
		
		scanner.close();
	}
	
}
