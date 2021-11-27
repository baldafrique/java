package chap06;

import java.util.Random;
import java.util.Scanner;

public class Shuffle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int number = scanner.nextInt();
		int[] original = new int[number];
		int[] shuffled = new int[number];
		int i;
		
		for (int j = 0; j < number; j++) {
			original[j] = scanner.nextInt();
		}
		
		for (int j = 0; j < number; j++) {
			
			do {
				i = random.nextInt(number);
			}
			while (shuffled[i] != 0);
			shuffled[i] = original[j];
		}
		
		for (int j : shuffled) {
			System.out.println(j);
		}
		
		scanner.close();
	}

}
