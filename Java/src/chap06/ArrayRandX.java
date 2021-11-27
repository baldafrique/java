package chap06;

import java.util.Random;
import java.util.Scanner;

public class ArrayRandX {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Number: ");
		int number = scanner.nextInt();
		int[] numbers = new int[number];
		int i = 0;
		
		numbers[0] = random.nextInt(10) + 1;
		
		while (i < number-1) {
			do {
				numbers[i+1] = random.nextInt(10) + 1;
			}
			while (numbers[i] == numbers[i+1]);
			i++;
		}
		
		for (int j : numbers) {
			System.out.println(j);
		}
		
		scanner.close();
	}

}
