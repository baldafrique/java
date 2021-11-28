package chap06;

import java.util.Random;
import java.util.Scanner;

public class MatrixProduct2 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int aRow, aCol = 0, bRow = 0, bCol;
		
		do {
			if (aCol != bRow) {
				System.out.println("Column of matrix A and row of matrix B must be same!");
			}
			System.out.print("Enter number of row and column of matrix A: ");
			aRow = scanner.nextInt();
			aCol = scanner.nextInt();
			
			System.out.print("Enter number of row and column of matrix B: ");
			bRow = scanner.nextInt();
			bCol = scanner.nextInt();
		} while (aCol != bRow);
		
		int[][] a = new int[aRow][aCol];
		int[][] b = new int[bRow][bCol];
		int[][] c = new int[aRow][bCol];
		
		for (int[] d : a) {
			for (int i = 0; i < d.length; i++) {
				d[i] = random.nextInt(5) + 1;
			}
		}
		
		for (int[] d : b) {
			for (int i = 0; i < d.length; i++) {
				d[i] = random.nextInt(5) + 1;
			}
		}
		
		for (int i = 0; i < aRow; i++) {
			for (int j = 0; j < bCol; j++) {
				for (int k = 0; k < aCol; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		
		System.out.println();
		
		System.out.println("Matrix A");
		for (int[] d : a) {
			for (int i = 0; i < aCol; i++) {
				System.out.print(d[i] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("Matrix B");
		for (int[] d : b) {
			for (int i = 0; i < bCol; i++) {
				System.out.print(d[i] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("Matrix C");
		for (int[] d : c) {
			for (int i = 0; i < bCol; i++) {
				System.out.print(d[i] + " ");
			}
			System.out.println();
		}
		
		scanner.close();
		
	}

}
