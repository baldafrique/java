package chap07;

import java.util.Random;

public class Min3 {
	
	public static int min(int[] numbers) {
		int min = numbers[0];
		
		for (int i = 1; i < numbers.length; i++) {
			if (min > numbers[i]) min = numbers[i];
		}
		
		return min;
	}

	public static void main(String[] args) {
		Random random = new Random();
		int[] numbers = new int[3];
		
		for (int i = 0; i < numbers.length; i++) numbers[i] = random.nextInt(5) + 1;
		
		System.out.print(min(numbers) + " is the smallest value in ");
		
		for (int number : numbers) {
			System.out.print(number + " ");
		}
		
		
	}

}
