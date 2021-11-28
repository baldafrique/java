package chap06;

import java.util.Random;

public class MatrixProduct {

	public static void main(String[] args) {
		Random random = new Random();
		int[][] a = new int[4][3];
		int[][] b = new int[3][4];
		int[][] c = new int[4][4];
				
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
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k <3; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		
		for (int[] d : a) {
			for (int i = 0; i < 3; i++) {
				System.out.print(d[i] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int[] d : b) {
			for (int i = 0; i < 4; i++) {
				System.out.print(d[i] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int[] d : c) {
			for (int i = 0; i < 4; i++) {
				System.out.print(d[i] + " ");
			}
			System.out.println();
		}
	}

}
