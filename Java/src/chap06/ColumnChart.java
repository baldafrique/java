package chap06;

import java.util.Random;
import java.util.Scanner;

public class ColumnChart {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = random.nextInt(10) + 1;
		}
		
		for (int i = 10; i >= 1; i--) {
			for (int j = 0; j < n; j++) {
				if (a[j] >= i) {
					System.out.print('*');
				}
				else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
		scanner.close();
	}

}
