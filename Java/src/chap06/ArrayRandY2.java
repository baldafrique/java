package chap06;

import java.util.Random;
import java.util.Scanner;

public class ArrayRandY2 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Number: ");
		int number = scanner.nextInt();
		int[] numbers = new int[number];
		
		for (int i = 0; i < number; i++) {
			int j;
			do {
				j = 0;
				numbers[i] = random.nextInt(10) + 1;
				for (; j < i; j++) {
					if (numbers[i] == numbers[j]) {
						break;
					}
				}
			}
			while (j < i);
		}
		
		scanner.close();
	}
	
}
