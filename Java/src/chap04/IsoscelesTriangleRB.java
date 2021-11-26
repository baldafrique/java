package chap04;

import java.util.Scanner;

public class IsoscelesTriangleRB {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for (int i=0; i<n; i++) {
			for (int k=n-1; k>i; k--) {
				System.out.print(' ');
			}
			for (int j=0; j<=i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		scanner.close();
	}

}
