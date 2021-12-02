package chap07;

import java.util.Scanner;

public class minOfHeightWeight {
	public static int minOf(int[] a) {
		int min = a[0];
		for (int i : a) {
			if (min > i) min = i;
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int[] heights = new int[number];
		int[] weights = new int[number];
		
		for (int i = 0; i < number; i++) {
			heights[i] = scanner.nextInt();
			weights[i] = scanner.nextInt();
		}
		
		System.out.println(minOf(heights));
		System.out.println(minOf(weights));
		
		scanner.close();
	}

}
