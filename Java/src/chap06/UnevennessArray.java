package chap06;

import java.util.Random;
import java.util.Scanner;

public class UnevennessArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		System.out.println("Create irregular two dimension arrangement.");
		System.out.print("Enter the number of row: ");
		int row = scanner.nextInt();
		int col;
		
		int[][] array = new int[row][];
		
		
		for (int i = 0; i < row; i++) {
			System.out.print("Enter the number of column in row " + (i + 1) + ": ");
			col = scanner.nextInt();
			array[i] = new int[col];
		}
		
		System.out.println();
		System.out.println("Arrangement");
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = random.nextInt(5) + 1;
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		scanner.close();
	}

}
